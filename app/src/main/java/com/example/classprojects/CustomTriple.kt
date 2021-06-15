package com.example.kotlincheatsheet

class CustomTriple<A : Any , B : Any , C : Any>
(
        var first : A,
        var second : B,
        var third : C
)
{
    fun printTypes()
    {
        println("The Type of First is : ${first :: class}");
        println("The Type of second is : ${second :: class}");
        println("The Type of third is : ${third :: class}");
    }
}