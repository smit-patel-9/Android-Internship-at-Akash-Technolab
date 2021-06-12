package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText username,mail,number,pass;
    RadioGroup rb;
    RadioButton radioButton;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        mail=findViewById(R.id.mail);
        number=findViewById(R.id.number);
        pass=findViewById(R.id.pass);
        rb=findViewById(R.id.rb);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String USERNAME,MAIL,PASS,NUMBER,RB;

                int RADIO_ID = rb.getCheckedRadioButtonId();
                radioButton=findViewById(RADIO_ID);

                RB = radioButton.getText().toString();
                USERNAME = username.getText().toString();
                MAIL = mail.getText().toString();
                PASS = pass.getText().toString();
                NUMBER = number.getText().toString();


                Intent intent = new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("username", USERNAME);
                intent.putExtra("mail",MAIL);
                intent.putExtra("password",PASS);
                intent.putExtra("number",NUMBER);
                intent.putExtra("gender",RB);
                startActivity(intent);


            }
        });

    }
}