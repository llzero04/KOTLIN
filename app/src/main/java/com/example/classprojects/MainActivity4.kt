package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    //BASIC CALCULATOR
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var btnCalculate = findViewById<Button>(R.id.btnCalculate);
        var etNumber1 = findViewById<EditText>(R.id.etNumber1);
        var etNumber2 = findViewById<EditText>(R.id.etNumber2);
        var spOperators = findViewById<Spinner>(R.id.spOperators);
        var tvCalculatorResult = findViewById<TextView>(R.id.tvCalculatorResult);

        btnCalculate.setOnClickListener {
            var num1 : Double = etNumber1.text.toString().toDouble();
            var num2 : Double = etNumber2.text.toString().toDouble();

            var operator : String = spOperators.selectedItem.toString();

            var res : Double = 0.0;

            when(operator)
            {
                "+" -> { res = num1 + num2 };
                "-" -> { res = num1 - num2 };
                "*" -> { res = num1 * num2 };
                "/" -> { res = num1 / num2 };
                "%" -> { res = num1 % num2 };
            }

            tvCalculatorResult.text = "Result : ${res}";
        }
    }
}