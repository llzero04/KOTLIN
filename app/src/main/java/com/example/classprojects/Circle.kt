//package com.example.kotlincheatsheet
//
//class Circle /* private constructor (*/(                  //We can Also Make The Constructor Private But we dont want to do that as it will only be accessible from the original class
//        var rad : Double
//) : Shape("Circle")
//{
//    private var pi : Double = 3.141592;         //Since We Dont want to give pi value every time we can put it out of Constructor  //Sice its Private we Cant access outside
//
//    init {
//        println("$name created with Radius : $rad");
//        println("$name Area is : ${area()}");
//        println("Perimeter of The $name is : ${perimeter()}");
//    }
//    fun area() : Double
//    {
//        return rad*rad*pi;
//    }
//
//    fun perimeter() : Double
//    {
//        return 2 * pi * rad;
//    }
//}






//package com.example.kotlincheatsheet
//
//class Circle /* private constructor (*/(                  //We can Also Make The Constructor Private But we dont want to do that as it will only be accessible from the original class
//        var rad : Double
//) : Shape("Circle")
//{
//    private var pi : Double = 3.141592;         //Since We Don't want to give pi value every time we can put it out of Constructor  //Since its Private we Cant access outside
//
//    init {
//        println("$name created with Radius : $rad");
//        println("$name Area is : ${area()}");
//        println("Perimeter of The $name is : ${perimeter()}");
//    }
//    override fun area() : Double
//    {
//        return rad*rad*pi;
//    }
//
//    override fun perimeter() : Double
//    {
//        return 2 * pi * rad;
//    }
//}





//---------------------------------------------------------


//NOTE :
//We are Gonna Use the Singleton Object Created by name of ImportantNumbers To replace it with PI So that each instance can share the same OBJECT

package com.example.kotlincheatsheet;
import kotlin.random.Random;

class Circle /* private constructor (*/(                  //We can Also Make The Constructor Private But we dont want to do that as it will only be accessible from the original class
        var rad : Double
) : Shape("Circle")
{


    //COMPANION OBJECT
    //This is very similar to OBJECT

    companion object
    {
        fun randomCircle() : Circle           //This is More Like Static Keyword in JAVA
        {
            var radius = Random.nextDouble(1.0 , 10.0);
            return Circle(radius);
        }
    }


    init {
        println("$name created with Radius : $rad");
        println("$name Area is : ${area()}");
        println("Perimeter of The $name is : ${perimeter()}");
    }

    //Here we replaced PI with ImportantNumbers.PI for Both Area and Perimeter

    override fun area() : Double
    {
        return rad*rad*(ImportantNumbers.PI);
    }

    override fun perimeter() : Double
    {
        return 2 * (ImportantNumbers.PI) * rad;
    }
}
