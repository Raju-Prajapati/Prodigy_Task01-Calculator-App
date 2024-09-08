package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    Button addButton, subtractButton, multiplyButton, divideButton;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        result = findViewById(R.id.result);

        addButton.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            @SuppressLint("SetTextI18n") double num2 = Double.parseDouble(number2.getText().toString());
            double sum = num1 + num2;
            result.setText("Result: " + sum);
        });

        subtractButton.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double difference = num1 - num2;
            result.setText("Result: " + difference);
        });

        multiplyButton.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double product = num1 * num2;
            result.setText("Result: " + product);
        });

        divideButton.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            if (num2 != 0) {
                double quotient = num1 / num2;
                result.setText("Result: " + quotient);
            } else {
                result.setText("Cannot divide by zero");
            }
        });
    }
}
