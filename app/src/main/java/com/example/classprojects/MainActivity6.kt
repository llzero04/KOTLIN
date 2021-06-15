package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity6 : AppCompatActivity() {

    //FISH FOOD SCHEDULER


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)



        var btnShowSchedule = findViewById<Button>(R.id.btnShowSchedule);
        var etTemp = findViewById<EditText>(R.id.etTemp);
        var etDirtSensorReading = findViewById<EditText>(R.id.etDirtSensorReading);
        var tvFishFood = findViewById<TextView>(R.id.tvFishFood);
        var tvChangeWater = findViewById<TextView>(R.id.tvChangeWater);

        btnShowSchedule.setOnClickListener {
            var temp = etTemp.text.toString().toInt();
            var dirtSensorReading = etDirtSensorReading.text.toString().toInt();

            var days = arrayOf("Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday");
            var day = days[Random.nextInt(7)];

            var food : String = fishFood(day);
            var toChangeWater : Boolean = changeWater(temp , dirtSensorReading , day);

            tvFishFood.setText("Fish Food : ${food}");
            tvChangeWater.setText("Change Water : ${toChangeWater}");

            Log.d("MainActivity3" , "${food}");
            Log.d("MainActivity3" , "${toChangeWater}");
        }
    }

    fun fishFood(day : String) : String
    {
        when(day)
        {
            "Monday" -> {return "flakes"};
            "Tuesday" -> {return "pellets"};
            "Wednesday" -> {return "redworms"};
            "Thursday" -> {return "granules"};
            "Friday" -> {return "mosquitoes"};
            "Saturday" -> {return "lettuce"};
            "Sunday" -> {return "plankton"};
        }
        return "";
    }


    fun changeWater(temp : Int , dirtSensorReading : Int , day : String) : Boolean
    {
        if(temp > 30 || dirtSensorReading > 30 || day.equals("Sunday"))
        {
            return true;
        }
        return false;
    }
}