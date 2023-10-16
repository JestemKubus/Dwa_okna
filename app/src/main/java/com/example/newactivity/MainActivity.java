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
        String LoginTym = "";
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
        String[] loginArr = {"Jan", "Adam", "Krzysztof"};
        ButtonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (String element: loginArr)
                {
                if(login.getText().toString().equals(element) && password.getText().toString().equals(PassTym))
                {
                    Intent intent = new Intent(MainActivity.this, secondView.class);
                    intent.putExtra("login",login.getText().toString());
                    startActivity(intent);
                    return;
                }
                else
                {
                    information.setText("Podano złe dane");
                }
            }
            }
        });
    }


//pobieranie wartości z inputa login: login.getText(), hasło:password.getText()
// sprawdzenie czy użytkownik wpisał coś do inputa z loginem: !login.getText().toString().isEmpty()
}