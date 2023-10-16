package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondView extends AppCompatActivity {
    TextView textView;
    Button ButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);

        textView = findViewById(R.id.textView);
        ButtonBack = findViewById(R.id.ButtonBack);

        String LoginValue = getIntent().getStringExtra("login");

        if(LoginValue != null)
        {
            textView.setText("Login: "+LoginValue);
        }
    }

    public void Back(View view) {
        Intent intent = new Intent(secondView.this, MainActivity.class);
        startActivity(intent);


    }
}