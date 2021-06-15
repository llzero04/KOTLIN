package com.example.kotlincheatsheet


//open class Animal(
//        var name : String,
//        var legCount : Int = 4
//    )                                  //This is a Constructor
//{
//    init {
//        println("Name of the Animal is : $name");
//    }
//}


//Abstract Class

//abstract class Animal(
//        var name : String,
//        var legCount : Int = 4
//)
//{
//    init {
//        println("Name of the species is $name");
//    }
//}



abstract class Animal (
        var name : String,
        var legCount : Int = 4
)
{
    init {
        println("Name of the species is $name");
    }

    abstract fun makeSound();   //So we need to implement this abstract function
}