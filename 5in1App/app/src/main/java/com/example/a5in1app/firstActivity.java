package com.example.a5in1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    Button btn,btn2,btn3,btn4,btn5;
    EditText et1,et2,et3,et4,et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        EditText et1=(EditText)findViewById(R.id.et1);
        EditText et2=(EditText) findViewById(R.id.et2);
        EditText et3=(EditText) findViewById(R.id.et3);
        EditText et4=(EditText) findViewById(R.id.et4);
        EditText et5=(EditText) findViewById(R.id.et5);

        Button btn=(Button) findViewById(R.id.btn);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    int n1,n2,n3,n4,n5,sum,ans;

                    n1=Integer.parseInt(et1.getText().toString());
                    n2=Integer.parseInt(et2.getText().toString());
                    n3=Integer.parseInt(et3.getText().toString());
                    n4=Integer.parseInt(et4.getText().toString());
                    n5=Integer.parseInt(et5.getText().toString());

                    sum=n1+n2+n3+n4+n5;
                    ans=sum/5;

                    Toast.makeText(firstActivity.this, "Percentage = "+ans, Toast.LENGTH_SHORT).show();

                }catch (Exception exception){
                    Toast.makeText(firstActivity.this, "Enter Numbers", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(firstActivity.this,secondActivity.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(firstActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(firstActivity.this, fourthActivity.class);
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(firstActivity.this, fifthActivity.class);
                startActivity(intent);

            }
        });


    }
}