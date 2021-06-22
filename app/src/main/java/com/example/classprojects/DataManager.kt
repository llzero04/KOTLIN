package com.example.classprojects

class DataManager {

    var courses = HashMap<String , CourseInfo>();
    var notes = mutableListOf<NoteInfo>();

    private fun initCourse()
    {
        var course = CourseInfo("Sonet-Kotlin" , "Android Development with Kotlin");
        courses.put(course.courseId , course);

        course = CourseInfo("Sonet-React" , "Web Development with React JS");
        courses.put(course.courseId , course);

        course = CourseInfo("Sonet-ML" , "Machine Learning");
        courses.put(course.courseId , course);
    }
}