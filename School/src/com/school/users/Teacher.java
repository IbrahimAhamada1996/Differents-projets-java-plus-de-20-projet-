package com.school.users;

public  class Teacher {

    private String firstName;
    private String lastName;
    private int matricule;


    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int matricule) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricule = matricule;
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

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void getInfo() {
        System.out.println("Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matricule=" + matricule +
                '}') ;
    }
}
