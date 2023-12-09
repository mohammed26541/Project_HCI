package com.example.project_hci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupUserName , signupEmail , signupPassword;
    private Button signupConform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        auth = FirebaseAuth.getInstance();
        signupUserName = findViewById(R.id.editTextText);
        signupEmail = findViewById(R.id.editTextText3);
        signupPassword = findViewById(R.id.editTextTextPassword);
        signupConform = findViewById(R.id.button);

        signupConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = signupUserName.getText().toString().trim();
                String email = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();

                if(user.isEmpty())
                {
                    signupUserName.setError("User Name cannot be Empty");
                }
                if(email.isEmpty())
                {
                    signupEmail.setError("Email cannot be Empty");
                }
                if(pass.isEmpty())
                {
                    signupPassword.setError("pass cannot by Empty");
                }else
                {
                    auth.createUserWithEmailAndPassword(email , pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(SignUpActivity.this , "SignUp Successful" , Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUpActivity.this , LoginActivity.class));
                            }else
                            {
                                Toast.makeText(SignUpActivity.this , "SignUp Failed" + task.getException().getMessage() , Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}