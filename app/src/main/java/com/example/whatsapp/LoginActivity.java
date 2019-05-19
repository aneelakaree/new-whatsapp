package com.example.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private Firebaseuser currentUser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    @Override
    protected void onStart() {

        super.onStart();

        if (currentUser == null) {

            SendUserToMainActivity();

            }

        }

    private void SendUserToMainActivity() {
        Intent LogInIntent=new Intent( packageContext LoginActivity.this,MainActivity.class);
        startActivity(LoginIntent);

    }
}