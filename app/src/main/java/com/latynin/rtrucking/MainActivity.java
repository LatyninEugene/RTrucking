package com.latynin.rtrucking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.*;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
    private  FirebaseAuth mAuth;
    private  FirebaseAuth.AuthStateListener mAuthListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void updateUI(FirebaseUser currentUser) {

    }
}
