package com.example.project_hci;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText login_username_email , login_pass;
    Button loginButton , SignupButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();
        login_username_email = findViewById(R.id.editTextText);
        login_pass = findViewById(R.id.editTextText2);
        loginButton = findViewById(R.id.button);
        SignupButton = findViewById(R.id.button3);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName_Email = login_username_email.getText().toString();
                String Password = login_pass.getText().toString();

                if(login_username_email.getText().toString().equals("admin") && login_pass.getText().toString().equals("123456"))
                {
                    Toast.makeText(LoginActivity.this , "Login Successful" , Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this , MainActivity.class));
                    finish();
                }
                if(!UserName_Email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(UserName_Email).matches())
                {
                    if(!Password.isEmpty())
                    {
                        auth.signInWithEmailAndPassword(UserName_Email , Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(LoginActivity.this , "Login Successful" , Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this , MainActivity.class));
                                finish();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                            }
                        });

                    }else
                    {
                        login_pass.setError("Password cannot be Empty");
                    }
                }else if(UserName_Email.isEmpty())
                {
                    login_username_email.setError("email cannot be empty");
                }else
                {
                    login_username_email.setError("Please enter valid email");
                }
            }
        });
        SignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this , SignUpActivity.class));
            }
        });
    }
}