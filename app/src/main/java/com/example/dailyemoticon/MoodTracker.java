package com.example.dailyemoticon;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MoodTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moodtracker);

        Button angryButton = findViewById(R.id.angryButton);
        Button happyButton = findViewById(R.id.happyButton);
        Button neutralButton = findViewById(R.id.neutralButton);
        Button surpriseButton = findViewById(R.id.surpriseButton);

        angryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start AngryMood activity
                Intent intent = new Intent(MoodTracker.this, AngryMood.class);
                startActivity(intent);
            }
        });

        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start HappyMood activity
                Intent intent = new Intent(MoodTracker.this, HappyMood.class);
                startActivity(intent);
            }
        });

        neutralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start NeutralMood activity
                Intent intent = new Intent(MoodTracker.this, NeutralMood.class);
                startActivity(intent);
            }
        });

        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start SurpriseMood activity
                Intent intent = new Intent(MoodTracker.this, SurpriseMood.class);
                startActivity(intent);
            }
        });
    }
}

