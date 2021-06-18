package com.example.classprojects

class QuizUtility {




    companion object
    {
        private var QuizQuestions = mutableListOf<QuizQuestion>();

        private var q1 : QuizQuestion = QuizQuestion(1 , "Who is ZERO?" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[0]" , "zero") , 1);
        private var q2 : QuizQuestion = QuizQuestion(2 , "Who is ZERO??" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[0]" , "zero") , 3);

        fun getQuestions() : List<QuizQuestion>
        {
            QuizQuestions.add(q1);
            QuizQuestions.add(q1);

            return QuizQuestions;
        }
    }
}