package com.example.dailyemoticon;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SadMood extends AppCompatActivity {
    private Button btnSubmitSad;
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sadmood);

        btnSubmitSad = findViewById(R.id.btnSubmitSad);
        btnBack = findViewById(R.id.btnBack);

        btnSubmitSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.dailyemoticon.SadMood.this, "Thank you for sharing!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SadMood.this, MoodTracker.class);
                startActivity(i);
            }
        });
    }
}