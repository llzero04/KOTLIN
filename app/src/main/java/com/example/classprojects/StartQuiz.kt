package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.get

class StartQuiz : AppCompatActivity() {

    var QuizQuestions : List<QuizQuestion> = QuizUtility.Companion.getQuestions();
    var currPosition : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)


        setQuestions();
    }

    fun setQuestions()
    {
        var llOptions = findViewById<LinearLayout>(R.id.llOptions);

        findViewById<TextView>(R.id.tvQuizQuestion).text = QuizQuestions[currPosition].question;

        for(i in 0 until 4)
        {
            var v = llOptions.get(i) as TextView;
            v.text = QuizQuestions[currPosition].options[i];
        }
    }
}