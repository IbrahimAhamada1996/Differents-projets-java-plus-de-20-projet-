package com.exos;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Student student =  new Student("ibrahim","L2",new double[]{1,8,6,9});
        student.addMark(155);
        student.addMark(100);
        System.out.println(student.toString());
        student.editeMark(0,8);
        System.out.println(student.toString());
        student.deleteMark(1);
        System.out.println(student.toString());
        System.out.println("sum = " + student.sum());
        System.out.println("averge= " + student.averge());
        System.out.println("min = " + student.min());
        System.out.println("max = " + student.max());
    }
}
