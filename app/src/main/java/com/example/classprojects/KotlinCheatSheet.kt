package com.example.pactise0

import android.graphics.Rect
import android.media.MediaPlayer
import android.text.BoringLayout
//import androidx.dynamicanimation.animation.DynamicAnimation
import java.lang.Exception
import java.lang.NumberFormatException
import java.util.concurrent.RecursiveAction

//fun main()
//{
//    println("Hello ZERO");
//}


//fun main()
// {
//    var myVar : Int = 0;
//    println(myVar);
//    println("Value of myVar : $myVar");
//
//    var b : Boolean = true;
//    if(b)
//    {
//        println("Valiue of b is $b");
//    }
//}



//fun main()
//{
//    val age : Short = 0;
//    var name : String = "ZERO";
//
//    print("My name is : $name");
//    println(" and i am $age years old");
//}


//fun main()
//{
//    val x = 15;
//    val y = 7;
//    val res = x + y;
//    println(res);
//}

//---------------------------------------------------
//--------------------------------------------------
//---------------------------------------------------

//TM

//fun main()
//{
//    println("Hello ZERO");
//    println("ZERO is 0");
//}


//fun main()
//{
//    var x : Int = 0;
//    println("Value of x is : $x");
//}


//Data Types

//fun main()
//{
//    var x : Int = 0;                        //VARIABLES
//    println("Value of x : $x");
//    x = 300;
//    println("Value of x now is : $x");
//
//    val c : Int = 100;
//    println("Value of Const is : $c");
//
//    var l = 300L;                           //Declaration of LONG NUMBER (2 to power of 64)
//
//    var d = 3.33;                             //By default is a DOUBLE
//    var f = 3.66f;                          //Declaration of a FLOAT
//
//
//    val wholeNumber : Int = 3;
//    val bigNumber : Long = 300L;
//    val preciseDecimal : Double = 3.33;
//    val decimal : Float = 3.66f;
//    val bool : Boolean = true;
//    val char : Char = 'Z';
//
//}


//Arithmatic Operators

//fun main()
//{
//    // + , - , * , / , %
//
//    val x = 3*4;
//    println(x);
//
//    val a = 3;
//    val b = 4;
//    println(a + b);
//    println(a - b);
//    println(a * b);
//    println(a / b);
//    println(a % b);
//
//
//    var res1 = 3 / 4;
//    var res2 = 3f / 4f;
//    println("Res1 : $res1");
//    println("Res2 : $res2");
//
//
//    //LOGICAL OPERATORS         == , != , && , || , !
//
//    var bool1 : Boolean = true;
//    var bool2 : Boolean = true;
//
//    println(bool1 && bool2);         //LOGICAL AND
//    println(bool1 || bool2);         //LOGICAL OR
//
//    var resbool : Boolean = bool1 == bool2;
//    println("ResBool : $resbool");
//
//    resbool = bool1 != bool2;
//    println("ResBool Now is : $resbool");
//
//    var newBool : Boolean = true;
//
//    println(newBool);
//    println(!newBool);
//
//}



//STRINGS

//fun main()
//{
//    val str = "ZERO is llzero04";
//    println(str);
//    println(str.toUpperCase());
//    println(str.toLowerCase());
//}



//IF Condition

//fun main()
//{
//    var x = 2;
////    x = 0;
//    x = 100;
//    if(x == 2)
//    {
//        println("The value of x is 2");
//    }
//    else if(x == 0)
//    {
//        println("The value of x is 0");
//    }
//    else
//    {
//        println("X is neither 2 nor 0");
//    }
//
//    x = 0;
//    //Since There is no Ternary Operator in Kotlin
//    var y = if(x == 0) 0 else 100;
//
//    println("Value of Y is $y");
//}
//



//NULL SAFETY IS THERE IN KOTLIN
//JAVA Program would crash if we had set the variable to a NULL and tried accessing that variable
//Kotlin has NULL safety and prevents that Not to the Fullest

//fun main()
//{
////    var x : Int? = null; //NULLABLE TYPE DECLARATION . Normally All variables are Non Nullable Type
//
////    var num1 = readLine();
////    var num2 = readLine();
////
//////    var res = num1.toInt() + num2.toInt();         //This Line Gives an error as readline gives a NULLABLE String in return as it takexs user from input. And Kotlin doesnt know how to add two NULL Values.
////
////    //To check for a NULL Value we can put a ? mark before the .toInt().  The below line will only execute toInt() only when the if num1 != NULL
////    //EXPRESSION : //num1?.toInt()                  // If num1 is NULL Then it would become NULL and The kotlin wouldnt know how to add two numbers even now
////    //So To prevent this we use
////
////    var res = num1!!.toInt() + num2!!.toInt();             //We are assuring KOTLIN that the values wouldnt be null. if it is null it would crash like java.
////    println(res);
//
//    var num1 = readLine() ?: "0";        //If we Enter Nothing this readline will give an empty String . So we need to Check for an Empty String
//    var num2 = readLine() ?: "0";  //So here we are assigning the string to ZERO if the user input is NULL
//
//
//}


//LISTS
//DATA CONTAINER


//fun main()
//{
//    //IMMUTABLE LIST (we cant add or remove items)
//    var list = listOf<String>("ZERO" , "llzero04" , "ZERO[0]");
//    println(list[0]);
//    println(list[2]);
//
//    //MUTABLE LIST
//    var l1 = mutableListOf("ZERO" , "llzero04" , "ZERO[0]");
//
//    l1.add("llZERO04");
//
//    println(l1[3]);
//
//}


//LOOPS

//fun main()
//{
//
//    //MUTABLE LIST
//    var l1 = mutableListOf("ZERO" , "llzero04" , "ZERO[0]");
//
//    l1.add("llZERO04");
//
////    println(l1[3]);
//
//    var i = 0;
//
//    //WHILE LOOP
////    while(i < l1.size)
////    {
////        println("$i index in L1 is : " + l1[i]);
////        i++;
////    }
//
//
//    //FOR LOOP
//
////    for(name in l1)
////    {
////        println(name);
////    }
//
////    for(i in 0..3)
////    {
////        println(l1[i]);
////    }
//
//
//    for(i in 0 until 4)
//    {
//        println(l1[i]);
//    }
//}



//SWITCH CASE

//fun main()
//{
////    var num : Int? = readLine()?.toInt();
////    var num : Int? = readLine()!!.toInt();
//
//    var num = readLine()?.toInt();
////    var num1 : Int = num.toInt();
//
//    when(num) {
//        in 1..2 -> {
//            println("x is btn 1 and 2")
//        };
//        in 3..10 -> {
//            println("x is btn 3 and 10")
//        };
//        else ->
//        {
//            println("x is not btn 1 and 10");
//        }
//    }
//}




//FUNCTIONS

//fun print10Numbers()
//{
//    for(i in 1 until 11)
//    {
//        print("$i ");
//    }
//    println();
//}
//
//
//fun isEven(number : Int) : Boolean                 //Arguements are passed in paranthesis and return type is Boolean
//{
////    if(number%2 == 0)
////    {
////        return true;
////    }
////    else if(number%2 != 0)
////    {
////        return false;
////    }
//    return number%2 == 0;
//}
//
//fun sum(num1 : Int , num2 : Int = 0) : Int            //Default Parameter . Here num2 is the Default Parameter
//{
//    return num1 + num2;
//}
//
//
////Extension Function
//
////The below function can be called on Integers
//
//fun Int.isOdd() : Boolean
//{
//    return this % 2 == 1;
//}
//
//
//
//fun main()
//{
////    print10Numbers();
//
////    var x = isEven(3);
////
////    println(x);
//
//
//    println(sum(1,2));
//    println(sum(1));
//
//    println(sum(num2 = 5 , num1 = 1));
//
//    println(3.isOdd());
//}



//CLASSES


//fun main()
//{
////    var dog = Animal("Dog");
//
////    var dog = Dog();
////    dog.bark();
////
////    var cat = Cat();
////    cat.meow();
//
//    //Now we cant create an animal class
//
////    var animal = Animal("Dog");
//
//    var dog = Dog();
//    var cat = Cat();
//
//    dog.makeSound();
//    cat.makeSound();
//}



//ANONYMOUS CLASSES

//fun main()
//{
//    var bear = object : Animal("Bear")
//    {
//        override fun makeSound() {
//            println("Roarrr!!");
//        }
//    }
//
//    bear.makeSound();
//}


//EXCEPTION HANDLING

//fun main()
//{
//    var num = readLine() ?: "0"
////    if(num.equals(""))
////    {
////        num = "0";
////    }
//
////    println(num.toInt());
//
//    var parsedNumber = try {
//        num.toInt();
//    }
//    catch(e : Exception) {
//        0;
//    }
//    println(parsedNumber);
//
//}




//LAMBDA FUNCTIONS

//fun main()
//{
//    var list = listOf("ZERO" , "llzero04" , "ZERO[0]");
//
////    var count = list.count {currentString ->
////        currentString.length == 8
////    }
//
//    var count = list.customCount {currentString ->
//        currentString.length == 8
//    }
//    println(count);
//}


//Custom Lambda Function

//fun List<String>.customCount(function : (String) -> Boolean) : Int
//{
//    var c = 0;
//    for(string in this)
//    {
//        if(function(string))
//        {
//            c = c + 1;
//        }
//    }
//    return c;
//}



//GENERICS

//fun <T> List<T>.customCount(function : (T) -> Boolean) : Int
//{
//    var c = 0;
//    for(string in this)
//    {
//        if(function(string))
//        {
//            c = c + 1;
//        }
//    }
//    return c;
//}











//---------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------









//PL



//fun main()
//{
//    println("Hello ZERO");
//}


//fun main()
// {
//    var myVar : Int = 0;
//    println(myVar);
//    println("Value of myVar : $myVar");
//
//    var b : Boolean = true;
//    if(b)
//    {
//        println("Value of b is $b");
//    }
//}



//fun main()
//{
//    val age : Short = 0;
//    var name : String = "ZERO";
//
//    print("My name is : $name");
//    println(" and i am $age years old");
//}


//fun main()
//{
//    val x = 15;
//    val y = 7;
//    val res = x + y;
//    println(res);
//}





//fun main()
//{
//    println("ZERO!!");
//}


//fun main()
//{
//    var myVariable : Int = 10;
////    println(myVariable);
//    myVariable = 100;
//    println("The value of my variable is $myVariable");
//}



//fun main()
//{
//    val num : Boolean = false;      //Should be assigned only at declaration or otherwise it gives error
//    var v : Boolean = true;
//    println(v);
//}



//ARITHMETIC OPERATORS

//fun main()
//{
//    var x = 15;
//    var y = 7;
//    var res = x + y;
//    println(res);
//
//    res = x - y;
//    println(res);
//
//    res = x * y;
//    println(res);
//
//    res = x / y;
//    println(res);
//
//    res = x % y;
//    println(res);
//}


//fun main()
//{
//    var x = 2;
//    var y = 5;
//    println("The result of x and y is : ${x + y}");
//
//    //SHORT HAND ASSIGNMENT OPERATOR += , -= , *= , /=
//    x += 10;
//    println("The result of x and y is : ${x + y}");
//}


//fun main()
//{
//    var x :Int = 3;
//    var y : Int = 4;
//    var z : Int = 5;
//
//    println("x: $x");
//    println("x + y: ${x + y}");
//    println("x + Y + z: ${x + y + z}");
//}



//FLOATS

//fun main()
//{
//    //Float takes 32bits or 4bytes
//    var x : Float = 20.15F;
//    var y : Float = 8F;
//
//    println("The result of x / y is : ${x / y}");
//
//    //Double is 64bits or 8bytes
//    var d1 : Double = 20.1527837347857;
//    var d2 : Double = 8.0;
//    println("The result x / y is : ${d1 / d2}");
//}


//fun main()
//{
//    var rad : Float = 5.5F;
//    println("Volume of sphere with radius $rad is : ${0.75 * 3.14 * rad * rad * rad}");
//}



//STRINGS

//fun main()
//{
//    var str : String = "ZERO is LL";
//    println("The string is : $str");
//    println("The string length is : ${str.length}");
//    println("The string is : ${str.toUpperCase()}");
//    println("The string is : ${str.toLowerCase()}");
//
//}


//fun main()
//{
//    var name : String = "ZERO";
//
//    println(name.toUpperCase());
//    println(name.toLowerCase());
//    println(name.reversed());
//}


//LOGICAL AND COMPARISION OPERATORS

//fun main()
//{
//    var x = 4;
//    var y = 5;
//    println(x == y);
//    println(x < y);
//    println(x <= y);
//    println(x > y);
//    println(x >= y);
//    println(x != y);
//
//    var a = 6;
//    var b = 10;
//
//    x = 5;
//    y = 5;
//    //LOGICAL OPERATORS (Works with Boolean values)
//    //&& Operator has higher precedence than ||
//    println();
//    println(x == y && a == b );
//    println(x == y || a == b);
//    println(!(x == y || a == b));
//}


//fun main()
//{
//    val simpleExpression = 3 > 4 || 4 > 3 && 4<=4;
//    println(simpleExpression);
//}




//IF CONDITION

//fun main()
//{
//    var x = 5;
//    var y = 7;
//
////    x = 8;
//    x = 7;
//    if(x < y)
//    {
//        println("X is less than Y");
//    }
//    else if(x > y)
//    {
//        println("X is greater than Y");
//    }
//    else if(x == y)
//    {
//        println("X is equal to Y");
//    }
//    println("This will always be executed");
//
//    //Sice there is no Ternary Operator . we Can do the below
//
//    var z = if(x == y) 0 else 3000
//    println(z);
//}


//fun main()
//{
//    var str : String = "racecar";
//
//    if(str == str.reversed())
//    {
//        println("The String $str is a Palindrome!!");
//    }
//    else
//    {
//        println("The String $str is not a Palindrome");
//    }
//}




//NULL VALUES AND USER INPUT


//fun main()
//{
//    //ReadLine may return NULL if the readline is unable to take input.But it needs to give some return value so it gives NULL
////    var Input = readLine();
////    println("You Entered : $Input");
////    println(Input?.toUpperCase());         // We need to put the ? as It cant work with NULL strings. We are telling the compiler to check if it is NULL or not. If it not NULL then it applies the method . If it is NULL it returns NULL.
////    println(Input + 5);
////    println(null);
//
//    val userInput = readLine();
////    println(userInput?.toInt() - 5);           //Since ? may return NULL if readLine gives NULL And the compiler cant subtract 5 from NULL.So we need to check for NULL manually
//
//    //Manually Checking For NULL
//    if(userInput != null)
//    {
//        println(userInput.toInt() - 5);
//    }
//}


//
//fun main()
//{
////    print("Enter your Age : ");
////    var userAge = readLine();
////
////    if(userAge != null)
////    {
////        if(userAge.toInt() < 18)
////        {
////            println("You are not an Adult");
////        }
////        else if (userAge.toInt() >= 18 && userAge.toInt() < 65)
////        {
////            println("You are An Adult");
////        }
////        else
////        {
////            println("You are really really Old");
////        }
////    }
//
//    print("Enter Your Age : ");
//    var userAge = readLine()?.toInt();
//
//    if(userAge != null)
//    {
//        if(userAge < 18)
//        {
//            println("You are not an Adult");
//        }
//        else if (userAge >= 18 && userAge < 65)
//        {
//            println("You are An Adult");
//        }
//        else
//        {
//            println("You are really really Old");
//        }
//    }
//}




//ARRAYS


//fun main()
//{
//    //Array is Just A Container(ALso Can Hold Mixed Types) and its size cant be changed
//    var arr = arrayOf("ZERO" , "llzero04" , "llZERO04");
//
////    println(arr); //Prints Out The Memory of Array
//
//    println(arr[0]);
//    println(arr[1]);
//    println(arr[2]);
//}



//WHILE LOOP


//fun main()
//{
////    var x : Int = 4;
////
////    while(x > 0)
////    {
////        println("ZERO");
////        x--;
////    }
////    println("After While Loop");
//
//    var arr = arrayOf("ZERO" , "llzero04" , "llZERO04");
//
//    var arrLength = arr.size;
//
//    var i = 0;
//
//    while(i < arrLength)
//    {
//        println("Value at index $i is ${arr[i]}");
//        i = i + 1;
//    }
//}



//fun main()
//{
//    var num = readLine()?.toInt();
//
//    println("Lets Count from $num to 0 : ");
//
//
//        if (num != null) {
//            while(num!! >= 0) {
//                println(num);
//                num = num - 1;
//            }
//        }
//
//}



//fun main()
//{
//    print("Enter number 1 : ");
//    var num1 = readLine()?.toInt();
//    print("Enter number 2 : ");
//    var num2 = readLine()?.toInt();
//    var res : Int = 1;
//
//    if(num1 != null && num2 != null)
//    {
//        //To calculate the power
//        var i : Int = num2;
//        while(i > 0)
//        {
//            res = res * num1;
//            i = i - 1;
//        }
//    }
//
//    println("$num1 to the power of $num2 is : $res");
//}




//FOR LOOPS


//fun main()
//{
////    var arr = arrayOf(1 , 2 , 3 , 4 , 5);
////
////    for(i in arr)
////    {
////        println(i);
////    }
//
//
//    //Defining a Range in For Loop
////    for(i in 1..5)
////    {
////        println(i);
////    }
//
//
//    //Reverse For Loop
////    for(i in 10 downTo 5)
////    {
////        println(i);
////    }
//
////    for(i in 10 downTo 5 step 2)
////    {
////        println(i);
////    }
//
////    for(i in 'a'..'z')
////    {
////        print("$i ");
////    }
//
//
//
//    var arr = arrayOf(8, 5, 6342, 1123 , 10);
//
//    var max : Int = arr[0];
//    for(ele in arr)
//    {
//        if(ele > max)
//        {
//            max = ele;
//        }
//    }
//
//    println("Max of the Array arr is : $max");
//}



//fun main()
//{
//    var arr = arrayOf(32,4,54,3,43,787,90);
//
//    var sum : Long = 0;
//
//    for(ele in arr)
//    {
//        sum = sum + ele;
//    }
//    println("Sum of Elements in Array is $sum");
//}



//fun main()
//{
//    var num : Int = 5;
//
//    var temp : Int?;
//    var sum : Long = 0L;
//
//    println("Enter 5 Numbers : ")
//    for(i in 0 until 5)
//    {
//        temp = readLine()?.toInt();
//        if(temp != null)
//        {
//            sum = sum + temp;
//        }
//    }
//
//    println("The average value is ${sum.toFloat() / 5}");
//}




//Labeled For Loop

//fun main()
//{
////    for(i in 0 downTo -10 step 2)
////    {
////        println(i);
////    }
//    var vi : Int = 0;
//    var vj : Int = 0;
//    first@ for(i in 0 until 100)
//    {
//        second@ for(j in 0 until 50)
//        {
//            if(j == 10)
//            {
//                break@first;
//            }
//            vj++;
//        }
//        vi++;
//    }
//
//    println("Value of i : ${vi}");
//    println("Value of j : ${vj}");
//}




//LISTS

//fun main()
//{
////    //Array Size cant be changed
////    var arr = arrayOf(1 , 2 , 3);
////    //IMMUTABLE(Values cant be changed)
////    var list = listOf(1 , 2 , 3);
////
////    arr[0] = 0;
//////    list[0] = 0;             //This is Invalid Because Lists are Normally Immutable
////
////    //Size of Mutable List can be changed
////    var list1 = mutableListOf(1 , 2 , 3);
////
////    //Appends At last
////    list1.add(4);
////    list1.add(5);
////    println(list1);
////
////    //Remove Removes item
////    //Takes The Values Already In List
////    list1.remove(2);
////
////    println(list1);
////
////    //RemoveAt -- Removes The Item at Specified Position
////
////    list1.removeAt(1);
////    println(list1);
//
//
//
//    val list = mutableListOf<Int>();           //This may be Val But this List cant Be reassigned
//
//    for(i in 1..10)
//    {
//        var input = readLine()?.toInt();
//
//        if(input != null)
//        {
//            list.add(input);
//        }
//    }
//
////    println(list);
//    for(i in list)
//    {
//        print("$i ");
//    }
//}




//fun main()
//{
//    var list = mutableListOf<Int>();
//
//    var temp : Int?;
//
//    println("Enter 5 Numbers : ")
//    for(i in 0 until 5)
//    {
//        temp = readLine()?.toInt();
//
//        if(temp != null)
//        {
//            list.add(temp);
//        }
//    }
//
//    println("The 5 Numbers in Reverse Order are : ");
//
//    for(i in 4 downTo 0)
//    {
//        println(list[i]);
//    }
//}



//fun main()
//{
//    println("Enter a number n > 1 : ");
//    var num : Int? = readLine()?.toInt();
//
//    var list = mutableListOf<Int>();
//
//    list.add(0);
//    list.add(1);
//
//    if(num != null)
//    {
//        for(i in 2 until num)
//        {
//            list.add(list[i - 1] + list[i - 2]);
//        }
//    }
//
//
//    println(list);
//
//}




//WHEN OR SWITCH CASE


//fun main()
//{
//    var age : Int? = readLine()?.toInt();
//    var x = 5;
//
//    when(age)
//    {
//        in 0..5 -> {println("You are a Young kid");}
//        in 6..17 -> {println("You are a Teenager");}
//        18 -> if(x == 5){{println("Finally, You are 18!!");}}
//        19,20 -> {println("You are a young Adult!!");}
//        in 21..65 -> {println("You are an Adult");}
//        else -> { println("You are really Old");}
//    }
//}


//fun main()
//{
//    println("Where are u from?");
//    var strInput : String? = readLine();
//
//    when(strInput)
//    {
//        "India" -> {println("Namaste");}
//        "USA" -> { println("Hello");}
//        "Germany" -> {println("Hallo");}
//        "Russia" -> {println("Privet");}
//        else -> {println("I don't know that");}
//    }
//}




//FUNCTIONS


//---------------------------------------------------------------



//fun main()
//{
////    print3Lines();
//
//    var x = 3;
//    var y = 4;
//    power(x , y);
//    power(x - 1 , y + 1);
//
//
//}
//
//fun power(base : Int , exp : Int)
//{
//    var mul : Long = 1L;
//
//    var i : Int = 1;
//    for(i in 0 until exp)
//    {
//        mul = mul * base;
//    }
//    println("Base $base to the power of Exp $exp is : $mul");
//}
//
//
//fun print3Lines()
//{
//    println("First");
//    println("Second");
//    println("Third");
//}




//-------------------------------------------------------------------------


//------------------------------------------------------------------------


//fun main()
//{
//    println("Enter a number : ");
//    var num : Int? = readLine()?.toInt();
//
//    if(num != null)
//    {
//        sumToN(num);
//    }
//}
//
//
//fun sumToN(num : Int)
//{
//    var sum : Long = 0L;
//
//    for(i in 1..num)
//    {
//        sum = sum + i;
//    }
//    println("The sum of the values from 1 to $num is : $sum");
//}

//-----------------------------------------------------------------------------



//fun main()
//{
//    println(power(3 , 3));
//}
//
//
//fun power(base : Int , exp : Int) : Int
//{
//    var res = 1;
//
//    for(i in 0 until exp)
//    {
//        res = res * base;
//    }
//    return res;
//}



//---------------------------------------------------------------------------------


//fun main()
//{
//    println(multiply(3 , 5));
//}
//
//fun multiply(a : Int , b : Int) = a*b;


//----------------------------------------------------------------------------------


//fun main()
//{
//    var l = listOf<Int>(1, 2 , 4 , 8);
//
//    printList(l);
//}
//
//
//fun printList(list : List<Int>)
//{
//    for(i in list)
//    {
//        print("$i ");
//    }
//    println();
//}


//----------------------------------------------------------------


//fun main()
//{
//    var list = mutableListOf<Int>();
//
//    var num : Int?;
//    print("Enter the no.of elements in the List : ");
//    num = readLine()?.toInt();
//
//    var temp : Int?;
//    for(i in 0 until num!!)
//    {
//        temp = readLine()?.toInt();
//        if(temp != null)
//        {
//            list.add(temp);
//        }
//    }
//
//    println("Enter Element to Search : ");
//    var s : Int? = readLine()?.toInt();
//
//    if(s != null)
//    {
//        search(list , s);
//    }
//
//}
//
//
//fun search(list : List<Int> , s : Int)
//{
//    var i = 0;
//    var flag : Boolean = false;
//    for(ele in list)
//    {
//        if(ele == s)
//        {
//            flag = true;
//            break;
//        }
//        i = i + 1;
//    }
//    if(flag)
//        println("Element $s found at index : $i");
//    else
//        println("No Such Element Found!!");
//}



//-------------------------------------------------------------------------------------

//VARARG IN FUNCTIONS

//fun main()
//{
////    var res = getMax(1,2,3,4,5,6,69);
////    println("The max is : "+ res);
//
//    var arr = intArrayOf(69 , 6969 , 10000);
//    var res = getMax(1 , 2, 3, 4, *arr , 100 , 9);
//    println("The max is : "+ res);
//
//}
//
////VARARG Means that there can variable no.of parameters that are all saved in numbers and are of type int as of below example
//fun getMax(vararg numbers : Int) : Int
//{
//    var max = numbers[0];
//
//    for(ele in numbers)
//    {
//        if(ele > max)
//        {
//            max = ele
//        }
//    }
//    return max;
//}


//----------------------------------------------------------------------------------



//DEFAULT PARAMETERS IN FUNCTIONS


//fun main()
//{
//    searchFor("ZERO is llzero04");
//    searchFor("ZERO is llzero04" , "Bing");
//    searchFor("ZERO is llzero04" , "DuckDuckGo");
//
//    //NAMED PARAMETER CALL
//
//    searchFor(searchEngine = "DuckDuckGo" , search = "ZERO");
//}
//
//fun searchFor(search : String , searchEngine : String = "Google")
//{
//    println("Searching for $search on Search Engine $searchEngine");
//}
//


//----------------------------------------------------------------------------------


//fun main()
//{
////    var sum = alternatingSum(1 , 2 , 3 , 4 , 5 ,69 , 96);
//    var sum = alternatingSum(3 , 4 , 5 , 2 , 1 , 2 , 3);
//
//    println("The Alternating Sum of arguements passed is : $sum");
//}
//
//fun alternatingSum(vararg numbers : Int) : Int
//{
//    var sum : Int = 0;
//
//    var len = numbers.size;
//
//    for(i in 0 until len)
//    {
//        if(i%2 == 0)
//        {
//            sum = sum + numbers[i];
//        }
//        else
//        {
//            sum = sum - numbers[i];
//        }
//    }
//    return sum;
//}



//------------------------------------------------------------------

//EXTENSION FUNCTIONS


//Here we are extending the int class of methods


//fun main()
//{
//    println("Enter a Number : ");
//    var input = readLine()?.toInt();
//
//    if(input != null)
//    {
//        if(input.isPrime())
//        {
//            println("The number is a Prime");
//        }
//        else
//        {
//            println("The number is not a Prime number");
//        }
//    }
//}
//
//fun Int.isPrime() : Boolean
//{
//    if(this == 1 || this == 2)
//    {
//        return true;
//    }
//    for(i in 2 until this)
//    {
//        if(this%i == 0)
//        {
//            return false;
//        }
//    }
//    return true;
//}




//Extension Function on List

//fun main()
//{
//    var list = listOf<Int>(1 , 2, 3 , 4 ,5);
//
//    println(list.multiply());
//}
//
//
//fun List<Int>.multiply() : Int
//{
//    var mul : Int = 1;
//    for(i in this)
//    {
//        mul = mul * i;
//    }
//    return mul;
//}





//OOPS

//CLASSES


//fun main()
//{
//    var myRect : Rectangle = Rectangle(4.0 , 7.0);
//
//    println("Rectangle Area is : " + myRect.area());
//    println("Rectangle Perimeter is : " + myRect.perimeter());
//    println("Is my Rectangle Square  : " + myRect.isSquare());
//
//    println();
//
//    var myCircle = Circle(5.0);
//    println();
//    var myCircle0 : Circle = Circle(7.0);
//
//}


//fun main()
//{
//    var myTriangle : Triangle = Triangle(2.0 , 4.0 , 6.0);
//}



//INHERITANCE


//fun main()
//{
//    var myCircle : Circle = Circle(5.0);
//    myCircle.changeName("ZERO");
//    println(myCircle.name);
//
//    var myTriangle = Triangle(3.0 , 3.0 , 3.0);
//    myTriangle.name = "llzero04";
//    println(myTriangle.name);
//}


//ACCESS MODIFIERS


//PUBLIC : By default all the variables or properties inside a class are PUBLIC
//PUBLIC can be accessed from all the files
//PRIVATE means it is not accessible outside the Class
//PROTECTED means it can be accesed by Class itself and Classes Which Inherit it


//fun main()
//{
//    var myTriangle = Triangle(3.0 , 3.0 ,3.0);
//
//}



//fun main()
//{
////    var shape : Shape = Shape("Circle");             //This Gives an ERROR as Shape class is ABSTRACT
//}



//CONSTRUCTOR AND FUNCTION OVERLOADING


//CONSTRUCTOR OVERLOADING

//fun main()
//{
//    var myRectangle : Rectangle = Rectangle(5.0);
//    var myRectangle1 : Rectangle = Rectangle(5 , 4);
//    var myRectangle2 : Rectangle = Rectangle(5.0 , 4.0);
//
//
//}




//FUNCTION OVERLOADING

//fun main()
//{
//    var myCircle : Circle = Circle(3.0);
//    var myTriangle : Triangle = Triangle(7.0 , 7.0 , 7.0);
//    var myRectangle : Rectangle = Rectangle(5.0);
//
//    var res1 : Double = maxArea(myRectangle , myCircle);
//    var res2 : Double = maxArea(myRectangle , myCircle , myTriangle);
//
//    println("Max area btn Circle and Rectangle is : ${res1}");
//    println("Max area btn Circle , Rectangle and Triangle is : ${res2}");
//}
//
//fun maxArea(shape1 : Shape , shape2 : Shape) : Double
//{
//    var areaShape1 = shape1.area();
//    var areaShape2 = shape2.area();
//
//    return if(areaShape1 > areaShape2) areaShape1 else areaShape2;
//}
//
//fun maxArea(shape1 : Shape , shape2 : Shape , shape3 : Shape) : Double
//{
//    var maxAreaShape1Shape2 = maxArea(shape1 , shape2);
//    var areaShape3 = shape3.area();
//
//    return if(maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3;
//}




//-------------------------------------------------------------------


//fun main()
//{
//    var arr = arrayOf(1 , 2 ,3 , 4 , 5);
//    var list = listOf<Int>(1 , 2, 3 , 4, 5);
//
//    println("Array in The Alternating (Pendulum) Order is :");
//    printOrder(arr);
//
//    println("List in The Alternating (Pendulum) Order is : ");
//    printOrder(list);
//}
//
//
//fun printOrder(arr : Array<Int>)
//{
//    var len : Int = arr.size;
//
//    var i : Int = 0;
//    var j : Int = len - 1;
//
//    while(i != j)
//    {
//        if(i == j)
//        {
//            break;
//        }
//        println(arr[i]);
//        println(arr[j]);
//
//        i = i + 1;
//        if(i == j)
//        {
//            break;
//        }
//
//        j = j - 1;
//    }
//
//}
//
//
//fun printOrder(list : List<Int>)
//{
//    var len : Int = list.size;
//
//    var i : Int = 0;
//    var j : Int = len - 1;
//
//    while(i != j)
//    {
//        if(i == j)
//        {
//            break;
//        }
//        println(list[i]);
//        println(list[j]);
//
//        i = i + 1;
//        if(i == j)
//        {
//            break;
//        }
//
//        j = j - 1;
//    }
//
//}



//-----------------------------------------------------------------------



//OBJECTS AND COMPANION OBJECTS

//In this We create a singleton

//For this Check the Object File Important Numbers and Check The Circle Class


//fun main()
//{
//    var circle : Circle = Circle.randomCircle();
//
//    println();
//
//    var rectangle : Rectangle = Rectangle.randomRectangle();
//}



//fun main()
//{
//    var rectangle : Rectangle = Rectangle.randomRectangle();
//}



///---------------------------------------------------------------------------



//ANONYMOUS CLASSES

//fun main()
//{
//    var a = 3.0;
//    var b = 4.0;
//    var ht = 2.0;
//    val parallelogram = object : Shape("Parallelogram" , a , b , ht)
//    {
//        init {
//            println("Parallelogram created with $a , $b and $ht");
//            println("Area is : ${area()}");
//            println("Perimeter is : ${perimeter()}");
//        }
//
//        override fun area(): Double {
//            return a*ht;
//        }
//
//        override fun perimeter(): Double {
//            return 2*a + 2*b;
//        }
//
//        fun isRectangle() : Boolean
//        {
//            return if(ht == b) true else false
//        }
//
//    }
//}




//EXCEPTIONS

//fun main()
//{
//    println("Please Enter a Number : ");
//    var input = try
//    {
//        readLine()?.toInt();
//    }
//    catch(e : NumberFormatException)
//    {
//        0
////        println("Please Enter an Integer");
//    }
//    finally {             //This Block is Executed in all Cases
//        println("This is From The Finally Block");
//    }
//    println("You Entered : $input");
//
//}




//fun main()
//{
//    var inpt = try {
//        readLine()?.toInt();
//    }
//    catch (e : Exception)    //This Class Exception is the super class of all exceptions. So this can catch any exception thrown
//    {
//        0;
//    }
//    println("You Entered : $inpt");
//
//}



//---------------------------------------------------------


//fun main()
//{
////    println("Enter a number : ");
////    var inpt = try{
////        readLine()?.toInt();
////    }
////    catch (e : Exception)
////    {
////        0;
////    }
//
//
//    //CUSTOM EXCEPTION
////    println(divide(5.0 , 0.0));
//
//    var div = try {
//        divide(5.0 , 0.0);
//    }
//    catch (e : DivisionBy0Exception)
//    {
////        println(e);
//        0;
//    }
//    println("The result of the Division is : $div");
//}
//
//
//class DivisionBy0Exception : Exception("Divide By 0 Is not possible")
//
//
//fun divide(a : Double , b : Double) : Double
//{
//    if(b == 0.0)
//    {
//        throw DivisionBy0Exception();
//    }
//    return a/b;
//}


//--------------------------------------------------------------------------------




//LAMBDA FUNCTIONS


//fun main()
//{
//    var list = (1..20).toList();
//
//    println(list);
//    //Filter is a Lambda Function
//    list = list.filter {
//        if(it%2 == 0) true else false          //it : refers to the current item
//    }
//    println(list);
//}




//Custom LAMBDA FUNCTION


//fun main()
//{
//    var list : List<Int> = (1..100).toList();
//
//    //Checking For Primes in the List
////    list = list.customFilter {
////        if(it == 1 || it == 2) true;
////
////        for(i in 2 until it)
////        {
////            if(it % i == 0)
////                false;
////        }
////        true;
////    }
//
//
//    list = list.customFilter {
//        if(it %2 != 0) true;
//
//        else
//            false;
//    }
//    println(list);
//}
//
//
//fun List<Int>.customFilter(filterFunction : (Int) -> (Boolean)) : List<Int>
//{
//    var res = mutableListOf<Int>();
//
//    for(ele in this)
//    {
//        if(filterFunction(ele))
//        {
//            res.add(ele);
//        }
//    }
//    return res;
//}

//-------------------------------------------------------------------

//fun main()
//{
//    var list : List<Int> = (1..10).toList();
//
//    var res : Int = list.customSum { if(it % 2 == 0) true else false };
//    println(res);
//}
//
//
//fun List<Int>.customSum(customFunction : (Int) -> Boolean) : Int
//{
//    var res : Int = 0;
//
//    for(ele in this)
//    {
//        if(customFunction(ele))
//        {
//            res = res + ele;
//        }
//    }
//    return res;
//}



//--------------------------------------------------------------------------------



//GENERICS


//fun main()
//{
//    var list : List<Int> = (1..10).toList();
//
//    list = list.customFilter { if(it % 2 == 0) true else false };
//    println(list);
//}
//
////T is basically a placeholder for any type
//
////Now T has to be A Number : Int or Float
//fun <T : Number> List<T>.customFilter(filterFunction : (T) -> Boolean) : List<T>
//{
//    var res = mutableListOf<T>();
//    for(ele in this)
//    {
//        if(filterFunction(ele))
//        {
//            res.add(ele);
//        }
//    }
//    return res;
//}





//GENERIC CLASSES

//Refer the CustomTriple Class for Generic class

//fun main()
//{
//    var triple = CustomTriple<Int , String , Boolean>(0 , "ZERO" , true);
//
//    triple.printTypes();
//}


//fun main()
//{
//    var str : String? = "ZERO is llzero04"
//    var arr = str!!.split(" ");
//
//    println(arr);
//}



//
//fun main()
//{
////    var str : String? = "ZERO is llzero04";
//
//    var str : String? = null;
//
//    var res : String = str ?: "ZERO";
//
//    println(res);
//}







//OOPS Practise

//class Person
//{
//    var name : String = "";
//    var age : Int = 0;
//
//    constructor(n : String , a : Int)
//    {
//        name = n;
//        age = a;
//    }
//
//    fun getDetails()
//    {
//        println("Name of Person is : ${name}");
//        println("Age of Person is : ${age}");
//    }
//}


//class Person (n : String , a : Int)
//{
//    var name : String = n;
//    var age : Int = a;
//
//    init {
//        println("Person Name : ${name}");
//        println("Person Age : ${age}");
//    }
//
//    init{
//        println("Hello There!!");
//    }
//}
//
//
//fun main()
//{
////    var p1 : Person = Person("ZERO" , 0);
////    p1.getDetails();
//
//    var p1 : Person = Person("ZERO" , 0);
//
//}




//-------------------------------------------------


//open class Person
//{
//    var occupation : String = "";
//    constructor(o : String)
//    {
//        occupation = o;
//    }
//}
//
//
//class Manager : Person
//{
//    var name : String = "";
//
//    constructor(name : String) : super("Manager")
//    {
//        this.name = name;
//    }
//
//    fun getDetails()
//    {
//        println("Name is : ${name}");
//        println("Occupation is : ${occupation}");
//    }
//}
//
//
//fun main()
//{
//    var M : Manager = Manager("ZERO");
//
//    M.getDetails();
//}


//-------------------------------------------------------------------------


//open class Human
//{
//    var name : String = "";
//    var gender : String = "";
//    constructor(name : String , gender : String)
//    {
//        this.name = name;
//        this.gender = gender;
//    }
//}
//
//
//class Manager : Human()
//{
//    var company : String = "";
//    constructor(name : String , gender : String , company : String) : super(name , gender)
//    {
//        this.company = company;
//    }
//
//
//
//    fun getDetails()
//    {
//        println("Name is : ${this.name}");
//        println("Gender is : ${this.gender}");
//        println("Company is : ${this.company}");
//    }
//}
//
//
//fun main()
//{
//    var person1 : Manager = Manager("llzero04" , "Male" , "ZERO");
//
//    person1.getDetails();
//
//    println(person1)
//}



//-----------------------------------------------------------------


//Interfaces


//interface Human
//{
//    //Uninitialized Variables
//    var name : String;
//    var occupation : String;
//
//    //Non-Abstract Method
//    fun displayName()
//    {
//        println("Name of the Person is : ${this.name}");
//    }
//
//    //Abstract Method
//    fun displayDetails();
//}
//
//
//class Manager : Human
//{
//    override var name: String = "ZERO";
//    override var occupation : String = "Manager";
//
//    override fun displayDetails()
//    {
//        println("Name is : ${name}");
//        println("Occupation is : ${occupation}");
//    }
//}
//
//
//
//fun main()
//{
//    var p1 : Manager = Manager();
//
//    p1.displayDetails();
//}




//--------------------------------------------------------


//interface Vehicle
//{
//    var companyName : String;
//    var modeOfTravel : String;
//    open var wheels : Int;
//
//    fun displayVehicleDetails();
//}
//
//
//class Kia : Vehicle
//{
//    override var companyName : String = "Kia";
//    override var modeOfTravel : String = "Land";
//    override var wheels : Int = 4;
//
//    override fun displayVehicleDetails() {
//        println("Company Name : ${this.companyName}");
//        println("Mode Of Travel : ${this.modeOfTravel}");
//        println("No.Of Wheels : ${this.wheels}");
//    }
//}
//
//
//fun main()
//{
//    var car1 : Kia = Kia();
//
//    car1.displayVehicleDetails();
//}




//------------------------------------------------------------




//ACCESS SPECIFIERS

//open class A
//{
//    var a : Int = 1;        //Default is Public
//    private var b : Int = 2;  //Visible to Base Class
//    protected open var c : Int = 3;  //Visible to Base and Derived Class
//
//    public var d : Int = 4;
//
//    fun displayA()
//    {
//        println("In A : a : ${this.a} , b : ${this.b} , c : ${this.c} , d : ${this.d}");
//    }
//}
//
//
//open class B : A()
//{
//    fun displatB()
//    {
//        println("In B : a : ${this.a} , c : ${this.c} , d : ${this.d}")
//    }
//}
//
//class C : B()
//{
////    override var c: Int = 100;
//
//    fun displayC()
//    {
//        println("In C : c : ${this.c}");
//    }
//}
//
//fun main()
//{
//    var obj : C = C();
//    obj.displayA();
//    obj.displatB();
//    obj.displayC();
//}


//--------------------------------------------------------------------------------





//COLLECTIONS

//List
//Set
//Map



//LISTS

//listOf is Immutable
//mutableListOf is Mutable

//fun main()
//{
//    var l1 : List<Int> = listOf<Int>(1 , 2 , 3);
//
//    for(i in 0 until l1.size)
//    {
//        println("Value at index at ${i} : ${l1[i]}");
//    }
//}





//fun main()
//{
//    var l1 = mutableListOf<Int>();
//
//    l1.add(1);
//    l1.add(2);
//    l1.add(3);
//
//    l1.remove(2);
//    l1.removeAt(1);
//
//    println(l1);
//}



//SET

//setOf - Immutable
//mutableSetOf , hashSetOf - Mutable

//Doesn't allow Duplicates

//fun main()
//{
//    var s1 : Set<Int> = setOf(4 , 4 , 3 , 2 , 1);
//
//    println(s1);
//}



//fun main()
//{
//    var A : Int = 100;
//    var B : String = "ZERO";
//    var s1 = setOf(A , B);
//
//    println(s1);
//}



//fun main()
//{
//    var s1 = mutableSetOf<Int>(-1 , 4 , 4 , 3 , 2 , 1);
//
//    println(s1);
//
//    s1.add(0);
//
//    println(s1);
//}


//fun main()
//{
//    var s1 = hashSetOf<Int>(-1 , 4 , 4 , 3 , 2 , 1 );
//    println(s1);
//}




//Map


//fun main()
//{
//    var m1 : Map<String , Int> = mapOf<String , Int>("ZERO" to 0 , "llzero04" to 1);
//
//    for(key in m1.keys)
//    {
//        println("${key} : ${m1[key]}");
//    }
//}



//fun main()
//{
//    var m1 = mutableMapOf<String , Int>();
//
//    m1.put("ZERO" , 0);
//    m1.put("llzero04" , 1);
//    m1.put("ZERO[0]" , 2);
//
//    m1.remove("ZERO[0]");
//
//    for(key in m1.keys)
//    {
//        println("${key} : ${m1[key]}");
//    }
//}


