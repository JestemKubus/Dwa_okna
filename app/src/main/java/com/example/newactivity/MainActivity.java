package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

        Button ButtonLogIn;
        TextInputEditText login;
        TextInputEditText password;
        String LoginTym = "test";
        String PassTym = "test";
        TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.textInputEdit);
        password = findViewById(R.id.textInputEditPassword);
        ButtonLogIn = findViewById(R.id.zaloguj);
        information = findViewById(R.id.information);
        ButtonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(login.getText().toString().equals(LoginTym) && password.getText().toString().equals(PassTym))
                {
                    Intent intent = new Intent(MainActivity.this, secondView.class);
                    intent.putExtra("login",login.getText().toString());
                    startActivity(intent);
                }
                else
                {
                    information.setText("Podano złe dane");
                }


            }
        });
    }


//pobieranie wartości z inputa login: login.getText(), hasło:password.getText()
}