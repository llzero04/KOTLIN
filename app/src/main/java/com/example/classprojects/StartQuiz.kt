package com.example.classprojects

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.view.get

class StartQuiz : AppCompatActivity() , View.OnClickListener {

    var QQ : QuizUtility = QuizUtility();
    var QuizQuestions : List<QuizQuestion> = QQ.getQuestions();
    var CurrentQuestion : Int = 0;
    var Score : Int = 0;
    var SelectedOption : Int = 0;
    var SubmitFlag : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_quiz)


        var btnQuizNext = findViewById<Button>(R.id.btnQuizNext);
        var btnQuizEnd = findViewById<Button>(R.id.btnQuizEnd);


        btnQuizNext.setOnClickListener {
            if(btnQuizNext.text.toString() == "Submit Answer")
            {
                var llOptions : LinearLayout = findViewById<LinearLayout>(R.id.llOptions);

                var SelectedTv : TextView = llOptions.get(SelectedOption - 1) as TextView;

                SelectedTv.background = ContextCompat.getDrawable(this , R.drawable.wrong_answer_bordered_rectangle);

                var CorrectTv : TextView = llOptions.get(QuizQuestions[CurrentQuestion].answer - 1) as TextView;

                CorrectTv.background = ContextCompat.getDrawable(this , R.drawable.correct_answer_bordered_rectangle);

                btnQuizNext.text = "Next";


                var ans : Int = QuizQuestions[CurrentQuestion].answer;

                if(SelectedOption == QuizQuestions[CurrentQuestion].answer)
                {
                    Score = Score + 1;
                }

                SubmitFlag = 1;
            }

            else if(btnQuizNext.text.toString() == "Next")
            {
                CurrentQuestion = CurrentQuestion + 1;

                if(CurrentQuestion == QuizQuestions.size)
                {
                    Toast.makeText(this , "Score is : ${Score}" , Toast.LENGTH_LONG).show();

                    btnQuizNext.visibility = View.GONE;
                    return@setOnClickListener;
                }
                SubmitFlag = 0;
                setQuestions();
            }
        }


        btnQuizEnd.setOnClickListener{
            var nextActivity = Intent(this , QuizApp()::class.java);

            startActivity(nextActivity);
        }



        //Setting UserName Given By User
        var UserName : String? = intent.getStringExtra("name");
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

        findViewById<TextView>(R.id.tvQuizQuestion).text = QuizQuestions[CurrentQuestion].question;

        for(i in 0 until 4)
        {
            var v = llOptions.get(i) as TextView;
            v.text = QuizQuestions[CurrentQuestion].options[i];
            v.background = ContextCompat.getDrawable(this , R.drawable.bordered_rectangle);
        }

        findViewById<ProgressBar>(R.id.pgQuizProgressBar).max = QuizQuestions.size;
        findViewById<ProgressBar>(R.id.pgQuizProgressBar).progress = CurrentQuestion;
    }


    override fun onClick(v: View?) {

        if(SubmitFlag == 1)
        {
            return;
        }
        
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

        findViewById<Button>(R.id.btnQuizNext).text = "Submit Answer";
    }
}