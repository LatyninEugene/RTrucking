package com.latynin.rtrucking;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.*;
import com.google.firebase.*;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  FirebaseAuth mAuth;
    private  FirebaseAuth.AuthStateListener mAuthListener;
    private EditText EtMail;
    private EditText EtPassword;
    private Button btn_sign;
    private Button btn_reg;
    private Button btn_make;







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
        btn_reg = (Button)findViewById(R.id.reg);
        btn_make = (Button)findViewById(R.id.createBid);

        public void OnClick(View view){
            if (view.getId() == R.id.Enter){
                signi(EtMail.getText().toString(), EtPassword.getText().toString());

            }
            else if (view.getId() == R.id.reg){

            }
            else if (view.getId()==R.id.createBid){

            }

            public void signi(String mail, String password){
                mAuth.signInWithEmailAndPassword(mail, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){

                        }
                        else{
                            Toast.makeText(MainActivity.this,"Неправильно введен логин или пароль",Toast.LENGTH_SHORT).show();
                        }

                    }
                })
    }
    }



    }


}
