package com.park.users;

import com.park.materials.Computer;

public class User extends Worker{

    private Computer computer;
    private Integer loginDuration;

    public User() {

    }

    public User(Computer computer, Integer loginDuration) {
        this.computer = computer;
        this.loginDuration = loginDuration;
    }

    public User(String firstname, String lastname, Computer computer, Integer loginDuration) {
        super(firstname, lastname);
        this.computer = computer;
        this.loginDuration = loginDuration;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Integer getLoginDuration() {
        return loginDuration;
    }

    public void setLoginDuration(Integer loginDuration) {
        this.loginDuration = loginDuration;
    }

    public void use(){
        System.out.println(firstname+" "+lastname+" the User, I'use a computer");
    }

    public void getInfo() {
        System.out.println("User{" +
                "computer=" + computer +
                ", loginDuration=" + loginDuration +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }
}
