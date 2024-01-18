package com.example.dailyemoticon;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MoodTracker extends AppCompatActivity {
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moodtracker);

        Button angryButton = findViewById(R.id.angryButton);
        Button happyButton = findViewById(R.id.happyButton);
        Button neutralButton = findViewById(R.id.neutralButton);
        Button surpriseButton = findViewById(R.id.surpriseButton);
        Button sadButton = findViewById(R.id.sadButton);
        btnBack = findViewById(R.id.btnBack);

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start AngryMood activity
                Intent i = new Intent(MoodTracker.this, AngryMood.class);
                startActivity(i);
            }
        });

        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start HappyMood activity
                Intent i = new Intent(MoodTracker.this, HappyMood.class);
                startActivity(i);
            }
        });

        neutralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start NeutralMood activity
                Intent i = new Intent(MoodTracker.this, NeutralMood.class);
                startActivity(i);
            }
        });

        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start SurpriseMood activity
                Intent i = new Intent(MoodTracker.this, SurpriseMood.class);
                startActivity(i);
            }
        });

        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start SurpriseMood activity
                Intent i = new Intent(MoodTracker.this, SadMood.class);
                startActivity(i);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MoodTracker.this, DateActivity.class);
                startActivity(i);
            }
        });
    }
}

