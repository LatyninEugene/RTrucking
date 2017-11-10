package com.latynin.rtrucking;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.*;
import com.google.firebase.*;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
    private  FirebaseAuth mAuth;
    private  FirebaseAuth.AuthStateListener mAuthListener;
    private EditText EtMail;
    private EditText EtPassword;
    private Button btn_sign;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user !=null){

                }
                else{

                }


            }

        }
        EtMail = (EditText)findViewById(R.id.mail);
        EtPassword = (EditText)findViewById(R.id.pass);
        btn_sign = (Button)findViewById(R.id.Enter);


    }

    private void updateUI(FirebaseUser currentUser) {

    }
}
