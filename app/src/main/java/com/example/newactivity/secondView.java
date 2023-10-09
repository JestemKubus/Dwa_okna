package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondView extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);

        textView = findViewById(R.id.textView);
        String LoginValue = getIntent().getStringExtra("login");

        if(LoginValue != null)
        {
            textView.setText("Login: "+LoginValue);
        }

    }
}