package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add, Sub, Div, Mul;
    EditText editText, editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editTextText2);
        result = findViewById(R.id.textView4);
        add = findViewById(R.id.button3);
        Sub = findViewById(R.id.button4);
        Div = findViewById(R.id.button6);
        Mul = findViewById(R.id.button5);


    }

    public void sum(View view) {

        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a + b;
        result.setText("Result: " + c);
    }


    public void Sub(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a - b;
        result.setText("Result: " + c);

    }

    public void Div(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a / b;
        if(a==Float.parseFloat(ET1.getText().toString()) & b==0){
            result.setText("Cannot divided by 0");

        } else {
            result.setText("Result: " + c);
        }

    }

    public void Mul(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a * b;
        result.setText("Result: " + c);

    }
    public void C(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        result.setText("0.0");
    }
}