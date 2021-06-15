//package com.example.kotlincheatsheet
//import kotlin.math.sqrt;
//
//class Triangle(
////    private var a : Double ,
//    var a : Double,
//    var b : Double ,             //This varible can be acessed outside
//    var c : Double
//) : Shape("Triangle")
//{
//    init {
//        println("$name Created with sides :   $a , $b , $c");
//        println("The Perimeter of the $name is : ${perimeter()}");
//        println("The Area of the $name is : ${area()}");
//    }
//
//    fun perimeter() : Double
//    {
//        return (a + b + c);
//    }
//
//    fun area() : Double
//    {
//        var per : Double = perimeter();
//        return sqrt( (per / 2) * (per / 2 - a) * (per / 2 - b) * (per / 2 - c));
//    }
//}



package com.example.kotlincheatsheet
import kotlin.math.sqrt;

class Triangle(
//    private var a : Double ,
        var a : Double,
        var b : Double ,             //This varible can be acessed outside
        var c : Double
) : Shape("Triangle")
{
    init {
        println("$name Created with sides :   $a , $b , $c");
        println("The Perimeter of the $name is : ${perimeter()}");
        println("The Area of the $name is : ${area()}");
    }

    override fun perimeter() : Double
    {
        return (a + b + c);
    }

    override fun area() : Double
    {
        var per : Double = perimeter();
        return sqrt( (per / 2) * (per / 2 - a) * (per / 2 - b) * (per / 2 - c));
    }
}