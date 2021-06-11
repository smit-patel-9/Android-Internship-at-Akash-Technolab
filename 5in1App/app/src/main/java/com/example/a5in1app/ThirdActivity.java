package com.example.a5in1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    EditText et;
    Button btn,btn1,btn2,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText et = (EditText) findViewById(R.id.et);
        Button btn = (Button) findViewById(R.id.btn);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    int n;
                    n=Integer.parseInt(et.getText().toString());
                    if(n>0){
                        Toast.makeText(ThirdActivity.this, n+" is Positive", Toast.LENGTH_SHORT).show();
                    }else{
                        if(n==0){
                            Toast.makeText(ThirdActivity.this, "Number is Zero", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(ThirdActivity.this, n+" is Negitive", Toast.LENGTH_SHORT).show();
                        }
                    }


                }catch (Exception e){
                    Toast.makeText(ThirdActivity.this, "Enter input text", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(ThirdActivity.this,firstActivity.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(ThirdActivity.this, secondActivity.class);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(ThirdActivity.this, fourthActivity.class);
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(ThirdActivity.this, fifthActivity.class);
                startActivity(intent);

            }
        });
    }
}