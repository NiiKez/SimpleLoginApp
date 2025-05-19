package com.example.simplelogin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView welcomeText = findViewById(R.id.textView);
        String username = getIntent().getStringExtra("username");

        if (username != null) {
            welcomeText.setText("Willkommen, " + username + "!");
        } else {
            welcomeText.setText("Willkommen!");
        }
    }
}
