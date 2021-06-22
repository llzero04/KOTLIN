package com.example.classprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class NotesTakingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_taking2)

        var dm = DataManager();

        var coursesAdapter = ArrayAdapter<CourseInfo>(this , android.R.layout.simple_spinner_item , dm.courses.values.toList());
        coursesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        var spNotesCourses = findViewById<Spinner>(R.id.spNotesCourses);

        spNotesCourses.adapter = coursesAdapter;
    }
}