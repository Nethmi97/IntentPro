package com.example.intentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import static android.view.View.*;

public class FirstActivity extends AppCompatActivity {
    Button but_ok;
    EditText number1,number2;
    String string1, string2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_ok = findViewById(R.id.button);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        but_ok.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                string1 = number1.getText().toString();
                string2 = number2.getText().toString();

                intent.putExtra("key1",string1);
                intent.putExtra("key2",string2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Sending Message....";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
                toast.show();

            }

        });
    }
}