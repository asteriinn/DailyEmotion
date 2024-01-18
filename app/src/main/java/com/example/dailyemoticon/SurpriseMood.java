package com.example.dailyemoticon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SurpriseMood extends AppCompatActivity {
    private Button btnSubmitSurprise;
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surprisemood);

        btnSubmitSurprise = findViewById(R.id.btnSubmitSurprise);
        btnBack = findViewById(R.id.btnBack);

        btnSubmitSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.dailyemoticon.SurpriseMood.this, "Thank you for sharing!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SurpriseMood.this, MoodTracker.class);
                startActivity(i);
            }
        });
    }
}