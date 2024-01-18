package com.example.dailyemoticon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText editTextUsername, editTextPassword, editTextConfirmPassword, editTextEmail;
    Button buttonSignup;

    public static final String myPref="myPref";
    public static final String usernamekey="usernamekey";
    public static final String pwdkey="pwdkey";
    public static final String emailkey="emailkey";

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSignup = findViewById(R.id.buttonSignup);

        sp=getSharedPreferences(myPref, Context.MODE_PRIVATE);

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username=editTextUsername.getText().toString();
                String pwd=editTextPassword.getText().toString();
                String email=editTextEmail.getText().toString();

                SharedPreferences.Editor editor=sp.edit();

                editor.putString(usernamekey,username);
                editor.putString(pwdkey,pwd);
                editor.putString(emailkey,email);
                editor.commit();

                Toast.makeText(SignupActivity.this, "Welcome to Daily Emoticon!!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(i);

            }
        });
    }

}
