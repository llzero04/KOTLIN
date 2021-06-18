package com.example.classprojects

class QuizQuestion {

    var id : Int = 0;
    var question : String = "";
    var options = mutableListOf<String>();
    var answer : Int = 0;
//    var options = arrayListOf<String>();

    constructor(id : Int , q : String , op : List<String> , ans : Int)
    {
        this.id = id;
        this.question = q;

        for(i in op)
        {
            options.add(i);
        }

        this.answer = ans;
    }

}