const db = require("../models");
const config = require("../config/auth.config");
const User = db.user;
const Role = db.role;
const Op = db.Sequelize.Op;
var jwt = require("jsonwebtoken");
var bcrypt = require("bcryptjs");
const nodemailer = require('nodemailer')

const EMAIL_SECRET = 'asdf1093KMnzxcvnkljvasdu09123nlasdasdf';
const transporter = nodemailer.createTransport( {
  service: 'Gmail',
  auth: {
    type: 'OAuth2',
    user: "nsucomplaints.noreply@gmail.com",
    pass: "NSUcomplaints#123456789",
    clientId: '189085341403-6jkd13am7e6r6e75os36vmh2g4phunqi.apps.googleusercontent.com',
    clientSecret: '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',
    refreshToken: '1//04VfxLkicBl8XCgYIARAAGAQSNwF-L9IrVRnX8xAc9F866a0SOR4E8yEI94o2aych6N2ERoXVaRr-0l1HLOK8dbJCMeagUSZgzlo',
  },
  tls: {
    rejectUnauthorized: false
}
});

exports.signup = (req, res) => {
  // Save User to Database
  User.create({
    nsuid: req.body.nsuid,
    email: req.body.email,
    password: bcrypt.hashSync(req.body.password, 8),
    name:req.body.name,
    verified: req.body.verified ? req.body.verified : "false",
    status:"activated",
    photo:"n/a",
    idscan:"n/a"
    
  })
    .then(user => {

      try{

        emailToken = jwt.sign( {user: req.body.nsuid}, EMAIL_SECRET )
        const url = `http://localhost:5000/confirmation/${emailToken}`
  
          transporter.sendMail({
            from: "nsucomplaints.noreply@gmail.com",
            to: req.body.email,
            subject: "Confirm Email",
            html: `Please click this email to confirm your email: <a target="_blank" href="${url}">${url}</a>`,
        })
        
       }catch(e){
        res.status(808).send()
       }

      if (req.body.roles) {
        Role.findAll({
          where: {
            name: {
              [Op.or]: req.body.roles
            }
          }
        }).then(roles => {
          user.setRoles(roles).then(() => {
            
            res.send({ message: "User was registered successfully!" });
          });
        });
      } else {
        // user role = 1
        user.setRoles([1]).then(() => {
          res.send({ message: "User was registered successfully!" });
        });
      }
    })
    .catch(err => {
      res.status(500).send({ message: err.message });
    });
};
exports.signin = (req, res) => {
  User.findOne({
    where: {
      nsuid: req.body.nsuid
    }
  })
    .then(user => {
      if (!user) {
        return res.status(404).send({ message: "User Not found." });
      }
      var passwordIsValid = bcrypt.compareSync(
        req.body.password,
        user.password
      );
      if (!passwordIsValid) {
        return res.status(401).send({
          accessToken: null,
          message: "Invalid Password!"
        });
      }
      
      if(user.verified == "false"){
        return res.status(512).send({
          accessToken: null,
          message: "Invalid Password!"
        });
      }

      var token = jwt.sign({ id: user.nsuid }, config.secret, {
        expiresIn: 86400 // 24 hours
      });
      var authorities = [];
      user.getRoles().then(roles => {
        for (let i = 0; i < roles.length; i++) {
          authorities.push("ROLE_" + roles[i].name.toUpperCase());
        }
        res.status(200).send({
          id: user.id,
          nsuid: user.nsuid,
          email: user.email,
          roles: authorities,
          verified: user.verified,
          accessToken: token
        });
      });
    })
    .catch(err => {
      res.status(500).send({ message: err.message });
    });
};
exports.findAll = (req, res) => {
    
  
    User.findAll({attributes: ['name', 'nsuid']})
      .then(data => {
        res.send(data);
      })
      .catch(err => {
        res.status(500).send({
          message:
            err.message || "Some error occurred while retrieving tutorials."
        });
      });
  };
 


exports.update = (req, res) => {
  try {
    jwt.verify(req.params.token, EMAIL_SECRET, (err, user)=>{
      let nsuid = user.user
      // await models.User.update({ confirmed: true }, { where: { id } });
      // let sql = 'UPDATE user SET verified=\'true\' WHERE nsuid=\''+ nsuid+'\';'
      
      User.update({verified: "true"}, {where: {nsuid: nsuid}})
    });
    
    
  } catch (e) {
    res.send('error');
  }

  return res.redirect('http://localhost:3000/login');
  };