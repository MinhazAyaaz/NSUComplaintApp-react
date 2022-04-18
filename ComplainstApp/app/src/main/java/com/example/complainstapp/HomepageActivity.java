package com.example.complainstapp;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomepageActivity extends AppCompatActivity{

    private Button createButton;
    private Button logoutButton;
    private ImageButton backButton;
    private RadioGroup filterGroup;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private String accessToken;
    private final ArrayList<Complaint> complaintArrayList = new ArrayList<>();
    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        createButton = findViewById(R.id.createButton5);
        filterGroup = findViewById(R.id.filterGrouping);
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.dataView);
        logoutButton = findViewById(R.id.signOutButton);

        accessToken = getIntent().getExtras().getString("token");

        //Log.e("Homepage Access Token",accessToken);

        progressBar.setVisibility(View.VISIBLE);

        AndroidNetworking.get("http://192.168.0.109:5000/getcomplaint/filed")
                .setTag("test1")
                .addHeaders("x-access-token",accessToken)
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener(){
                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i=0;i<response.length();i++){
                            Complaint tempComplaint = null;
                            try {
                                tempComplaint = new Complaint(response.getJSONObject(i).getString("complaintid"),response.getJSONObject(i).getString("createdAt"),
                                        response.getJSONObject(i).getString("status"), response.getJSONObject(i).getString("title"),
                                        response.getJSONObject(i).getString("against"),
                                        response.getJSONObject(i).getString("body"),response.getJSONObject(i).getString("reviewer")
                                        ,response.getJSONObject(i).getString("category"));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            complaintArrayList.add(tempComplaint);
                        }

                        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(complaintArrayList);
                        recyclerView.setAdapter(recyclerAdapter);
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                    @Override
                    public void onError(ANError error) {
                        Log.e("error",error.toString());
                    }
                });



        filterGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int selectedId) {

                complaintArrayList.clear();
                progressBar.setVisibility(View.VISIBLE);
                if(selectedId == R.id.radioButton3){
                    AndroidNetworking.get("http://192.168.0.109:5000/getcomplaint/filed")
                            .setTag("test1")
                            .addHeaders("x-access-token",accessToken)
                            .setPriority(Priority.LOW)
                            .build()
                            .getAsJSONArray(new JSONArrayRequestListener(){
                                @Override
                                public void onResponse(JSONArray response) {
                                    for(int i=0;i<response.length();i++){
                                        Complaint tempComplaint = null;
                                        try {
                                            tempComplaint = new Complaint(response.getJSONObject(i).getString("complaintid"),response.getJSONObject(i).getString("createdAt"),
                                                    response.getJSONObject(i).getString("status"), response.getJSONObject(i).getString("title"),
                                                    response.getJSONObject(i).getString("against"),
                                                    response.getJSONObject(i).getString("body"),response.getJSONObject(i).getString("reviewer")
                                                    ,response.getJSONObject(i).getString("category"));
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        complaintArrayList.add(tempComplaint);
                                    }

                                    RecyclerAdapter recyclerAdapter = new RecyclerAdapter(complaintArrayList);
                                    recyclerView.setAdapter(recyclerAdapter);
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                                @Override
                                public void onError(ANError error) {
                                    Log.e("error",error.toString());
                                }
                            });
                }
                else if(selectedId == R.id.radioButton4){
                    AndroidNetworking.get("http://192.168.0.109:5000/getcomplaint/received")
                            .setTag("test1")
                            .addHeaders("x-access-token",accessToken)
                            .setPriority(Priority.LOW)
                            .build()
                            .getAsJSONArray(new JSONArrayRequestListener(){
                                @Override
                                public void onResponse(JSONArray response) {
                                    for(int i=0;i<response.length();i++){
                                        Complaint tempComplaint = null;
                                        try {
                                            tempComplaint = new Complaint(response.getJSONObject(i).getString("complaintid"),response.getJSONObject(i).getString("createdAt"),
                                                    response.getJSONObject(i).getString("status"), response.getJSONObject(i).getString("title"),
                                                    response.getJSONObject(i).getString("against"),
                                                    response.getJSONObject(i).getString("body"),response.getJSONObject(i).getString("reviewer")
                                                    ,response.getJSONObject(i).getString("category"));
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        complaintArrayList.add(tempComplaint);
                                    }

                                    RecyclerAdapter recyclerAdapter = new RecyclerAdapter(complaintArrayList);
                                    recyclerView.setAdapter(recyclerAdapter);
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                                @Override
                                public void onError(ANError error) {
                                    Log.e("error",error.toString());
                                }
                            });
                }
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomepageActivity.this, CreateComplaint.class);
                intent.putExtra("token",accessToken);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();
            }
        });

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken("689285763404-9ih3lrpb9154mhob4rs8oqbpruvng95s.apps.googleusercontent.com")
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }

    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Intent intent = new Intent(HomepageActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}
