package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resSum = number1 + number2;
        resText.setText(Integer.toString(resSum));
    }
}