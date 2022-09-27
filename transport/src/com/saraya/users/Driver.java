package com.saraya.users;

public class Driver {

    private String idNumber;
    private String fullName;
    private double salary;

    public Driver() {
    }

    public Driver(String idNumber, String fullName, double salary) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Driver{" +
                "idNumber='" + idNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}');
    }
}
