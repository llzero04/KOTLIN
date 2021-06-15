package com.example.classprojects


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }


    //TIC TAC TOE


    var Board = arrayOf(arrayOf(0 , 0 , 0) , arrayOf(0 , 0 , 0) , arrayOf(0 , 0 , 0));

    var currPlayer : Int = 1;

    var moveCount : Int = 0;
    var gameOver : Boolean = false;

    fun coinAppear(view: View)
    {
        val img : ImageView = view as ImageView;
        var imgTag : Int = img.getTag().toString().toInt();

        var r : Int = imgTag / 3;
        var c : Int = imgTag % 3;

        Log.i("Tag" , "${r} ${c}");

        if(Board[r][c] == 0) {

            moveCount += 1;
            Board[r][c] = currPlayer;

            gameOver = checkBoard(r, c, currPlayer);

            if(gameOver)
            {
                if(currPlayer == 1)
                {
                    Toast.makeText(this , "White Wins" , Toast.LENGTH_LONG).show();
                    findViewById<TextView>(R.id.tvGameResult).text = "Result : White Wins";

                }
                else if(currPlayer == 2)
                {
                    Toast.makeText(this , "Black Wins" , Toast.LENGTH_LONG).show();
                    findViewById<TextView>(R.id.tvGameResult).text = "Result : Black Wins";

                }

                playAgain();
            }

            if(moveCount == 9)
            {
                Toast.makeText(this , "Match Drawn" , Toast.LENGTH_LONG).show();

                findViewById<TextView>(R.id.tvGameResult).text = "Result : Match Drawn";

                playAgain();
            }


            if (currPlayer == 1) {
                img.setImageResource(R.drawable.whitetictactoe);
                currPlayer = 2;
            }
            else if (currPlayer == 2) {
                img.setImageResource(R.drawable.blacktictactoe);
                currPlayer = 1;
            }
        }
    }


    fun checkBoard(row : Int , col : Int , currPlayer : Int) : Boolean
    {
        var i : Int = 0;
        var count : Int = 0;

        //Checking Row Elements
        for(i in 0 until 3)
        {
            if(Board[row][i] == currPlayer)
            {
                count = count + 1;
            }
        }

        if(count == 3)
        {
            return true;
        }

        //Checking Column Elements
        count = 0;
        for(i in 0 until 3)
        {
            if(Board[i][col] == currPlayer)
            {
                count = count + 1;
            }
        }

        if(count == 3)
        {
            return true;
        }


        //Checking Diagonals
        if(Board[0][0] == currPlayer && Board[1][1] == currPlayer && Board[2][2] == currPlayer)
        {
            return true;
        }

        if(Board[0][2] == currPlayer && Board[1][1] == currPlayer && Board[2][0] == currPlayer)
        {
            return true;
        }

        return false;
    }


    fun playAgain()
    {

        var btnPlayAgain = findViewById<Button>(R.id.btnPlayAgain);

        btnPlayAgain.visibility = View.VISIBLE;

        btnPlayAgain.setOnClickListener {
            Board = arrayOf(arrayOf(0 , 0 , 0 ) , arrayOf(0 , 0 , 0) , arrayOf(0 , 0 , 0));
            currPlayer = 1;
            gameOver = false;
            moveCount = 0;

            findViewById<TextView>(R.id.tvGameResult).text = "Result is Shown Here"

            findViewById<ImageView>(R.id.imgToken0).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken1).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken2).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken3).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken4).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken5).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken6).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken7).setImageResource(0);
            findViewById<ImageView>(R.id.imgToken8).setImageResource(0);
        }
    }
}