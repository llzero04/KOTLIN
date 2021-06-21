package com.example.classprojects

class QuizUtility {

    private var QuizQuestions = mutableListOf<QuizQuestion>();

    private var q1 : QuizQuestion = QuizQuestion(1 , "Who is ZERO?" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[0]" , "zero") , 1);
    private var q2 : QuizQuestion = QuizQuestion(2 , "Who is ZERO??" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[1]" , "zero") , 3);
    private var q3 : QuizQuestion = QuizQuestion(2 , "Who is ZERO???" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[2]" , "zero") , 2);
    private var q4 : QuizQuestion = QuizQuestion(2 , "Who is ZERO????" , mutableListOf<String>("llzero04" , "llZERO04" , "ZERO[3]" , "zero") , 4);

    fun getQuestions() : List<QuizQuestion>
    {
        QuizQuestions.add(q1);
        QuizQuestions.add(q2);
        QuizQuestions.add(q3);
        QuizQuestions.add(q4);

        return QuizQuestions;
    }

//    companion object
//    {
//
//
//        fun getQuestions() : List<QuizQuestion>
//        {
//            QuizQuestions.add(q1);
//            QuizQuestions.add(q2);
//            QuizQuestions.add(q3);
//            QuizQuestions.add(q4);
//
//            return QuizQuestions;
//        }
//    }
}