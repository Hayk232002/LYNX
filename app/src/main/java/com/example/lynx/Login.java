package com.example.lynx;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    Button btn_creatacc_login;
    Button btn_login_login;
    EditText et_email_login;
    EditText et_password_login;

    //Firebase
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_creatacc_login = (Button) findViewById(R.id.btn_creatacc_login);
        btn_login_login = (Button) findViewById(R.id.btn_login_login);
        et_email_login = (EditText) findViewById(R.id.et_email_login);
        et_password_login = (EditText) findViewById(R.id.et_password_login);

        mAuth = FirebaseAuth.getInstance();

        btn_creatacc_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registration1.class);
                startActivity(intent);
            }
        });

        btn_login_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                singing(et_email_login.getText().toString(),et_password_login.getText().toString());
            }
        });
    }

    public void singing(String email,String password){
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    if (mAuth.getCurrentUser().isEmailVerified()){
                        Intent intent = new Intent(Login.this, ProfileSettings.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }

                    else {
                        Toast.makeText(Login.this,"Please verify your email address",Toast.LENGTH_SHORT).show();
                    }
                }

                else {
                    Toast.makeText(Login.this,"Sign in failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
