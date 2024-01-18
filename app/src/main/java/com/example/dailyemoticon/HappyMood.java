package com.example.dailyemoticon;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HappyMood extends AppCompatActivity {
    private Button btnSubmitHappy;
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happymood);

        btnSubmitHappy = findViewById(R.id.btnSubmitHappy);
        btnBack = findViewById(R.id.btnBack);

        btnSubmitHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.dailyemoticon.HappyMood.this, "Thank you for sharing!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HappyMood.this, MoodTracker.class);
                startActivity(i);
            }
        });
    }
}
