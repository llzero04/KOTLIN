package com.example.kotlincheatsheet

class Dog : Animal("Dog") {
    init {
        legCount = 4;
    }

//    fun bark()
//    {
//        println("Woof!!");
//    }

    override fun makeSound() {
        println("Woof!!!!");
    }
}