package com.example.intentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number3,number4;
    String string3,string4,opr;
    Button plus,minus,mul,div;
    TextView display;
    int num1,num2;
    float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number3 = findViewById(R.id.editTextNumber3);
        number4 = findViewById(R.id.editTextNumber4);
        plus = findViewById(R.id.button2);
        minus = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button5);
        display = findViewById(R.id.textView5);

        string3 = getIntent().getStringExtra("key1");
        string4 = getIntent().getStringExtra("key2");


        number3.setText(string3);
        number4.setText(string4);

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number3.getText().toString());
                num2 = Integer.parseInt(number4.getText().toString());
                opr = "+";
                result = num1+num2;
                display.setText(number3.getText().toString()+ " " + opr +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }
        });



        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number3.getText().toString());
                num2 = Integer.parseInt(number4.getText().toString());
                opr = "-";
                result = num1-num2;
                display.setText(number3.getText().toString()+ " " + opr +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number3.getText().toString());
                num2 = Integer.parseInt(number4.getText().toString());
                opr = "*";
                result = num1*num2;
                display.setText(number3.getText().toString()+ " " + opr +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number3.getText().toString());
                num2 = Integer.parseInt(number4.getText().toString());
                opr = "/";
                result = num1/num2;
                display.setText(number3.getText().toString()+ " " + opr +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }
        });


    }

}