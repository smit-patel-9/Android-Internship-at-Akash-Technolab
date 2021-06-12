package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView username,mail,number,gender,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        username=findViewById(R.id.username);
        mail=findViewById(R.id.mail);
        number=findViewById(R.id.number);
        gender=findViewById(R.id.gender);
        pass=findViewById(R.id.pass);

        Intent intent = getIntent();

        String USERNAME,MAIL,NUMBER,GENDER,PASS;

        USERNAME=intent.getStringExtra("username");
        MAIL=intent.getStringExtra("mail");
        NUMBER=intent.getStringExtra("number");
        GENDER=intent.getStringExtra("gender");
        PASS=intent.getStringExtra("password");

        username.setText(USERNAME);
        mail.setText(MAIL);
        number.setText(NUMBER);
        gender.setText(GENDER);
        pass.setText(PASS);

    }
}