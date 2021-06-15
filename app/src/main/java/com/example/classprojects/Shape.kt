package com.example.kotlincheatsheet

//Open Class Means that this class can be inherited
//open class Shape(
//    protected var name : String
//)
//{
//    init {
//        println("I am The Super Class");
//    }
//
//    fun changeName(newName : String)
//    {
//        name = newName;
//    }
//}



//SINCE we dont want to make Shape Class Instances So we need to make it ABSTRACT

//abstract class Shape(
//        var name : String
//)
//{
//    init {
//        println("I am the Super Class");
//    }
//
//    fun changeName(newName : String)
//    {
//        name = newName;
//    }
//
//    abstract fun area() : Double;
//    abstract fun perimeter() : Double;
//}




//--------------------------------------------------------


//This is For ANONYMOUS CLASS

abstract class Shape(
        var name : String
)
{

    constructor(name :String , vararg dimensions : Double) : this(name);

    init {
        println("I am the Super Class");
    }

    fun changeName(newName : String)
    {
        name = newName;
    }

    abstract fun area() : Double;           //We are telling to Derived classes to Implement These ABSTRACT CLASSES otherwise we cant create an object of derived classes as they will also become abstract
    abstract fun perimeter() : Double;
}
