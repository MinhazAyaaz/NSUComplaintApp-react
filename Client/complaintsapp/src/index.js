import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

import reportWebVitals from './reportWebVitals';
import { render } from "react-dom";
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";

import App from './App';
import SignUp from './routes/SignUp';
import SignIn from './routes/SignIn';
import Profile from './routes/profile';
import EditPage from './routes/EditPage';
import Dashboard from './routes/dashboard';
import CreateComplaint from './routes/CreateComplaint';


ReactDOM.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />}/>
      <Route path="signup" element={<SignUp />}/>
      <Route path="signin" element={<SignIn />}/>
      <Route path="dashboard" element={<Dashboard />}/>
      <Route path="profile" element={<Profile />}/>
      <Route path="createcomplaint" element={<CreateComplaint />}/>
    </Routes>
  </BrowserRouter>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();