package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {

    //TAKING PERSON DETAILS AS USER INPUT AND MAKING TOAST WITH NAME GIVEN INTO UPPERCASE


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        var etName = findViewById<EditText>(R.id.etPersonName);
        var etAge = findViewById<EditText>(R.id.etPersonAge);
        var etGender = findViewById<EditText>(R.id.etPersonGender);
        var btnCreatePerson = findViewById<Button>(R.id.btnCreatePerson);

        btnCreatePerson.setOnClickListener {
            var name = etName.text.toString();
            var gender = etGender.text.toString();
            var age : Int = etAge.text.toString().toInt();

            var person : Person = Person(name, gender, age);

            Toast.makeText(this , person.getNameInCaps() , Toast.LENGTH_LONG).show();
        }
    }
}

class Person(
    var name : String,
    var gender : String,
    var age : Int
)
{
    fun getNameInCaps() : String
    {
        return name.toUpperCase();
    }
}