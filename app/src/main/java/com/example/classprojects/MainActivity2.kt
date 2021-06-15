package com.example.classprojects

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout



class MainActivity2 : AppCompatActivity() {

    //CHANGING THE BACKGROUND COLOR USING VALUES FROM SPINNER


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val layout = findViewById<ConstraintLayout>(R.id.clParent);
        val spBgColor = findViewById<Spinner>(R.id.spBgColors);
        val btnChangeBgColor = findViewById<Button>(R.id.btnChangeBgColor);

        btnChangeBgColor.setOnClickListener {
            var selectedColor : String = spBgColor.selectedItem.toString();

            when(selectedColor)
            {
                "Red" -> { layout.setBackgroundColor(Color.RED) };
                "Blue" -> { layout.setBackgroundColor(Color.BLUE) };
                "Green" -> { layout.setBackgroundColor(Color.GREEN) };
                "Yellow" -> { layout.setBackgroundColor(Color.YELLOW) };
                "Gray" -> { layout.setBackgroundColor(Color.GRAY) };
                "Black" -> { layout.setBackgroundColor(Color.BLACK) }
            }
        }

    }
}