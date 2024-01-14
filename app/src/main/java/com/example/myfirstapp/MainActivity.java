package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView newText;
    Button changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newText = findViewById(R.id.textView);
        changeButton = findViewById(R.id.firstButton);
    }

    @SuppressLint("SetTextI18n")
    public void pressMeButton(View view) {
        newText.setText("Find a great idea for the next app");
    }
}