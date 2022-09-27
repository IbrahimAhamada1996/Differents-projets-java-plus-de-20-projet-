package com.park.users;

public class Worker  {

    protected String firstname;
    protected String lastname;

    public Worker() {
    }

    public Worker(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void use(){
        System.out.println(firstname+" "+lastname+", I'use a computer");
    }
}
