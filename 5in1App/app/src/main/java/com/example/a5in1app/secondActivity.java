package com.example.a5in1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    EditText et1;
    TextView tv;
    Button btn,btn1,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText et1=(EditText) findViewById(R.id.et1);

        TextView tv=(TextView) findViewById(R.id.tv);

        Button btn=(Button) findViewById(R.id.btn);
        Button btn1=(Button) findViewById(R.id.btn1);;
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {

                    int n1,calc;
                    n1=Integer.parseInt(et1.getText().toString());
                    calc=n1*n1;

                    if (n1>10){
                        Toast.makeText(secondActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                    }else{

//                    Toast.makeText(secondActivity.this, n1+" square = "+calc, Toast.LENGTH_SHORT).show();
                        tv.setText("Square of "+n1+" is "+calc);

                    }

                }catch (Exception e){

                    Toast.makeText(secondActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();

                }


            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(secondActivity.this,firstActivity.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(secondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(secondActivity.this, fourthActivity.class);
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(secondActivity.this, fifthActivity.class);
                startActivity(intent);

            }
        });

    }
}