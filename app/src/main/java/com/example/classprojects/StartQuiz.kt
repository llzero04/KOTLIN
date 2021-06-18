package com.example.classprojects

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.get

class StartQuiz : AppCompatActivity() , View.OnClickListener {

    var QuizQuestions : List<QuizQuestion> = QuizUtility.Companion.getQuestions();
    var currPosition : Int = 0;
    var Score : Int = 0;
    var SelectedOption : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)

        var btnQuizNext = findViewById<Button>(R.id.btnQuizNext);

        btnQuizNext.setOnClickListener {
            var ans : Int = QuizQuestions[currPosition].answer;

            if(SelectedOption == QuizQuestions[currPosition].answer)
            {
                Score = Score + 1;

                findViewById<LinearLayout>(R.id.llOptions).setBackgroundColor(Color.GREEN);
            }
            else
            {
                findViewById<LinearLayout>(R.id.llOptions).setBackgroundColor(Color.RED);
            }
        }


        var UserName : String? = intent.getStringExtra("name");

        //Setting UserName Given By User
        findViewById<TextView>(R.id.tvParticipantName).text = UserName;


        //Setting the Options
        setQuestions();

        var llOptions = findViewById<LinearLayout>(R.id.llOptions);

        for(i in 0 until  4)
        {
            var tv : TextView = llOptions.get(i) as TextView;

            tv.setOnClickListener(this);
        }
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


    override fun onClick(v: View?) {
        var llOptions : LinearLayout = findViewById<LinearLayout>(R.id.llOptions);

        var tv : TextView = llOptions.get(0) as TextView;

        for(i in 0 until 4)
        {
            var tv : TextView = llOptions.get(i) as TextView;

            tv.background = ContextCompat.getDrawable(this , R.drawable.bordered_rectangle);
        }

        var tag : Int = v!!.tag.toString().toInt() - 1;
        SelectedOption = tag + 1;

        var selectedTv : TextView = llOptions.get(tag) as TextView;

        selectedTv.background = ContextCompat.getDrawable(this , R.drawable.selected_bordered_rectangle);

//        tv.background = ContextCompat.getDrawable(this , R.drawable.selected_bordered_rectangle);
    }
}