package com.school;

import com.school.courses.Course;
import com.school.grades.Grades;
import com.school.users.Student;
import com.school.users.Teacher;

public class App {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ibrahim","Ahamada",523);
                teacher.getInfo();

        Grades grade1 = new Grades("L1",426);
               grade1.getInfo();
        Grades grade2 = new Grades("L2",320);
                grade2.getInfo();

        Student student1 = new Student("Sara","Karim",grade1);
                student1.getInfo();
        Student student2 = new Student("Omar","Mendy",grade1);
                student2.getInfo();
        Student student3 = new Student("Ali","Omar",grade2);
                student3.getInfo();
        Student student4 = new Student("Marie","Rmace",grade2);
                student4.getInfo();

        Course course1 = new Course("Java",2,4,teacher,grade1);
               course1.getInfo();
        Course course2 = new Course("Html",12,14,teacher,grade2);
               course2.getInfo();



    }
}
