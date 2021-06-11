package com.example.a5in1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SymbolTable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormatSymbols;

public class fifthActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn,plus,minus,multiply,devide,btn1,btn2,btn3,btn4,btn5;
    int ans,n1,n2;
    String sym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn=findViewById(R.id.btn);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        devide=findViewById(R.id.devide);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans = n1 + n2;
                sym = "+";

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans = n1 - n2;
                sym = "-";

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans = n1 * n2;
                sym = "*";

            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans = n1 / n2;
                sym = "/";

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    n1=Integer.parseInt(et1.getText().toString());
                    n2=Integer.parseInt(et2.getText().toString());;

                    Toast.makeText(fifthActivity.this, n1+" "+sym+" "+" "+n2+" = "+ans, Toast.LENGTH_SHORT).show();

                }catch (Exception e){

                    Toast.makeText(fifthActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();

                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fifthActivity.this,firstActivity.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fifthActivity.this, secondActivity.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fifthActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fifthActivity.this, fourthActivity.class);
                startActivity(intent);

            }
        });
    }
}