package com.exos;

import java.util.Arrays;

public class Student {
    private String name;
    private String grad;
    private double[] marks;

    public Student(String name, String grad, double... marks) {
        this.name = name;
        this.grad = grad;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public void addMark(double mark){
        int lenght = marks.length+1;
        double[] newMarks = new  double[lenght];
        for (int i = 0; i <this.marks.length ; i++) {
            newMarks[i] = this.marks[i];
        }
        newMarks[lenght-1] = (double) mark;
        this.marks =newMarks ;
    }

    public void editeMark(int indice,double mark){
       this.marks[indice]=mark;

    }

    public void deleteMark(int index){

        int lenght = marks.length-1;
        double[] newMarks = new  double[lenght];
        int j=0;
        for (int i = 0; i <marks.length ; i++) {
            if (i != index){
                newMarks[j++] = this.marks[i];
            }
        }

        this.marks =newMarks ;

    }

    public double min(){
        if (this.marks.length> 0){
            double min=this.marks[0];
            for (int i = 1; i < this.marks.length; i++) {
                if (min >this.marks[i]){
                    min = this.marks[i];
                }

            }
            return min;
        }
        return 0 ;

    }

    public double max(){
        if (this.marks.length> 0){
            double max=this.marks[0];
            for (int i = 1; i < this.marks.length; i++) {
                if (max < this.marks[i]){
                    max = this.marks[i];
                }

            }
            return max;
        }
        return 0;
    }

    public double sum(){
        double s = 0;
        for (double number:this.marks
             ) {
            s+=number;
        }

        return s;
    }

    public double averge(){
        double s = 0;
        for (double number:this.marks
        ) {
            s+=number;
        }

        return s/this.marks.length;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grad='" + grad + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
