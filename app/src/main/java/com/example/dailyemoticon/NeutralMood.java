package com.example.dailyemoticon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NeutralMood extends AppCompatActivity {
    private Button btnSubmitNeutral;

    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neutralmood);

        btnSubmitNeutral = findViewById(R.id.btnSubmitNeutral);

        btnBack = findViewById(R.id.btnBack);

        btnSubmitNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.example.dailyemoticon.NeutralMood.this, "Thank you for sharing!", Toast.LENGTH_SHORT).show();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NeutralMood.this, MoodTracker.class);
                startActivity(i);
            }
        });

    }
}