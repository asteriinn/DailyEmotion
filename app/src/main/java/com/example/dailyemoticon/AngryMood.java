package com.example.dailyemoticon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AngryMood extends AppCompatActivity {
    private Button btnSubmitAngry;
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angrymood);

        btnSubmitAngry = findViewById(R.id.btnSubmitAngry);
        btnBack = findViewById(R.id.btnBack);

        btnSubmitAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.dailyemoticon.AngryMood.this, "Thank you for sharing!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AngryMood.this, MoodTracker.class);
                startActivity(i);
            }
        });
    }
}
