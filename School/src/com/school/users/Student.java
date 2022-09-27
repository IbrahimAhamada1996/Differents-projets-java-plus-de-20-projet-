package com.school.users;


import com.school.grades.Grades;

public class Student extends Teacher{


    private String firstName;
    private String lastName;
    private Grades grades;

    public Student() {
    }

    public Student(String firstName, String lastName, Grades grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public void getInfo() {
        System.out.println("Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}') ;
    }
}
