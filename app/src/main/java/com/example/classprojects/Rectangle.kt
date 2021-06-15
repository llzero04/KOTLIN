//package com.example.kotlincheatsheet
//
//class Rectangle(
//    var l : Double ,
//    var b : Double                         //Think of This as Property Declaration
//) : Shape("Rectangle")
//{
//    init {                  //This is executed whenever we create an Object
//        println("$name Created with l = $l and b = $b");
//    }
//
//    fun area()  : Double
//    {
//        return l*b;
//    }
//    fun perimeter() : Double
//    {
//        return 2*l + 2*b;
//    }
//
//    fun isSquare() : Boolean
//    {
//        if(l == b)
//        {
//            return true;
//        }
//        return false;
//    }
//
//}




//package com.example.kotlincheatsheet
//
//class Rectangle(
//        var l : Double ,
//        var b : Double                         //Think of This as Property Declaration
//) : Shape("Rectangle")
//{
//    init {                  //This is executed whenever we create an Object
//        println("$name Created with l = $l and b = $b");
//    }
//
//    override fun area()  : Double
//    {
//        return l*b;
//    }
//    override fun perimeter() : Double
//    {
//        return 2*l + 2*b;
//    }
//
//    fun isSquare() : Boolean
//    {
//        if(l == b)
//        {
//            return true;
//        }
//        return false;
//    }
//
//}












//CONSTRUCTOR OVERLOADING

//package com.example.kotlincheatsheet
//
//class Rectangle(
//        var l : Double ,
//        var b : Double                         //Think of This as Property Declaration
//) : Shape("Rectangle")
//{
//
//    //SECONDARY CONSTRUCTORS     //This Constructor is for a Square
//    constructor(a : Double) : this(a , a);            //this calls the Primary Constructors
//
//    constructor(a : Int , b : Int) : this(a.toDouble() , b.toDouble());
//
//
//    init {                  //This is executed whenever we create an Object
//        println("$name Created with l = $l and b = $b");
//    }
//
//    override fun area()  : Double
//    {
//        return l*b;
//    }
//    override fun perimeter() : Double
//    {
//        return 2*l + 2*b;
//    }
//
//    fun isSquare() : Boolean
//    {
//        if(l == b)
//        {
//            return true;
//        }
//        return false;
//    }
//
//}





//-------------------------------------------------------------


//Creating Companion Object For Rectangle Class

package com.example.kotlincheatsheet;

import android.graphics.Rect
import kotlin.random.Random;


class Rectangle(
        var l : Double ,
        var b : Double                         //Think of This as Property Declaration
) : Shape("Rectangle")
{


    //SECONDARY CONSTRUCTORS     //This Constructor is for a Square
    constructor(a : Double) : this(a , a);            //this calls the Primary Constructors

    constructor(a : Int , b : Int) : this(a.toDouble() , b.toDouble());


    //COMPANION ONJECT

    companion object
    {
        fun randomRectangle() : Rectangle
        {
            var a : Double = Random.nextDouble(1.0 , 10.0);
            var b : Double = Random.nextDouble(1.0 , 10.0);

            return Rectangle(a , b);
        }

    }






    init {                  //This is executed whenever we create an Object
        println("$name Created with l = $l and b = $b");
    }

    override fun area()  : Double
    {
        return l*b;
    }
    override fun perimeter() : Double
    {
        return 2*l + 2*b;
    }

    fun isSquare() : Boolean
    {
        if(l == b)
        {
            return true;
        }
        return false;
    }

}