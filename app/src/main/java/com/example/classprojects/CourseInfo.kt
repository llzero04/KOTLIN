package com.example.classprojects

class CourseInfo {
    var courseId : String = "";
    var title : String = "";

    constructor(cid : String , t : String)
    {
        courseId = cid;
        title = t;
    }

    override fun toString(): String {
        return title;
    }
}