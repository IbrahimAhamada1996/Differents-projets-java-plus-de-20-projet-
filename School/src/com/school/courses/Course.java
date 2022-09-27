package com.school.courses;


import com.school.grades.Grades;
import com.school.users.Teacher;

public class Course {
    private String name;
    private int startingHour;
    private int endingHour;
    private Teacher teacher;
    private Grades grades;

    public Course() {
    }

    public Course(String name, int startingHour, int endingHour, Teacher teacher, Grades grades) {
        this.name = name;
        if(startingHour>=0 && startingHour<=23)
            this.startingHour = startingHour;

        if(endingHour>=0 && endingHour<=23)
            this.endingHour = endingHour;

        this.teacher = teacher;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartingHour() {
        return startingHour;
    }

    public void setStartingHour(int startingHour) {
        if(startingHour>=0 && startingHour<=23)
                this.startingHour = startingHour;
    }

    public int getEndingHour() {
        return endingHour;
    }

    public void setEndingHour(int endingHour) {
        if(endingHour>=0 && endingHour<=23)
            this.endingHour = endingHour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }


    public void getInfo() {
        System.out.println( "Course{" +
                "name='" + name + '\'' +
                ", startingHour=" + startingHour +
                ", endingHour=" + endingHour +
                ", teacher=" + teacher +
                ", grades=" + grades +
                '}');
    }
}
