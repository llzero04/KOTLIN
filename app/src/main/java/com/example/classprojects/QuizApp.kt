package com.example.classprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuizApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_app)

        var btnQuiz = findViewById<Button>(R.id.btnQuiz);
        var etUserName = findViewById<EditText>(R.id.etUserName);

        btnQuiz.setOnClickListener {
            if(etUserName.text.toString().isEmpty())
            {
                Toast.makeText(this , "Enter User Name" , Toast.LENGTH_LONG).show();
            }
            else
            {
                var nextActivity : Intent = Intent(this , StartQuiz()::class.java);
                nextActivity.putExtra("name" , etUserName.text.toString());

                startActivity(nextActivity);

//                finish();
            }
        }
    }
}