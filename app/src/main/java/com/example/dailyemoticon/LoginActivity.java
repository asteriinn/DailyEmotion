package com.example.dailyemoticon;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    private TextView signUpRedirect;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        signUpRedirect = findViewById(R.id.signUpRedirect);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("Aisyah") && password.equals("123")) {
                    // Successful login
                    Intent i = new Intent(LoginActivity.this, DateActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(com.example.dailyemoticon.LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
            signUpRedirect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                    startActivity(i);
                }
        });
    }
}
