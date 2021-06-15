package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    //PRINTING THE RANGE FROM GIVEN USER INPUT


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnShowRange = findViewById<Button>(R.id.btnShowRange);
        val tvRange = findViewById<TextView>(R.id.tvRange);
        val etRange = findViewById<EditText>(R.id.etRange);

        btnShowRange.setOnClickListener {
            var resStr : String = "";

            val num : Int = etRange.text.toString().toInt();

            for(i in 1..num)
            {
                if(i == num)
                {
                    resStr = resStr + "${i}";
                }
                else
                {
                    resStr = resStr + "${i} ";
                }
            }

            tvRange.text = resStr;
        }
    }
}