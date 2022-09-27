package com.school.grades;
public class Grades {

    private String name;
    private int numberOfStudents;

    public Grades() {
    }

    public Grades(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    public void getInfo() {
        System.out.println("Grades{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}');
    }
}