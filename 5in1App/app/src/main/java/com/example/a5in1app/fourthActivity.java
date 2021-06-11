package com.example.a5in1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fourthActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn,btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    int n1,n2;
                    n1=Integer.parseInt(et1.getText().toString());
                    n2=Integer.parseInt(et2.getText().toString());

                    if (n1==n2){

                        Toast.makeText(fourthActivity.this, "Equal Numbers", Toast.LENGTH_SHORT).show();

                    }else{

                        if (n1>n2){
                            Toast.makeText(fourthActivity.this, n1+" is Greatest", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(fourthActivity.this, n2+" is Greatest", Toast.LENGTH_SHORT).show();
                        }

                    }

                }catch (Exception  e){

                    Toast.makeText(fourthActivity.this, "Enter The Number", Toast.LENGTH_SHORT).show();

                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fourthActivity.this,firstActivity.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fourthActivity.this, secondActivity.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fourthActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(fourthActivity.this, fifthActivity.class);
                startActivity(intent);

            }
        });

    }
}