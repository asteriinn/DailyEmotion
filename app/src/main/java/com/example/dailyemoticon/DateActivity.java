package com.example.dailyemoticon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DateActivity extends AppCompatActivity {
    private Button pickBtn,confirmBtn;
    private TextView tvBlank;
    private ImageView btnBack;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickdate);

        pickBtn = findViewById(R.id.pickDate);
        confirmBtn = findViewById(R.id.confirm);
        tvBlank = findViewById(R.id.blank);
        btnBack = findViewById(R.id.btnBack);

        pickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragmentdate = new DatePickerFragment();
                fragmentdate.show(getSupportFragmentManager(),"datePicker");

            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(DateActivity.this, MoodTracker.class);
                startActivity(in);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DateActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }

    public void processDatePickerResult(int year,int month,int day){

        String years = Integer.toString(year);
        String months = Integer.toString(month+1);
        String dates = Integer.toString(day);

        String choosenDate = dates + " - " + months + " - " + years;
        tvBlank.setText(choosenDate);
    }

}
