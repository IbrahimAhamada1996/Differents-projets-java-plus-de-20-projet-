package com.park.users;

import com.park.materials.Computer;

public class Manager extends Worker{

    private String username;
    private Computer computer;


    public Manager() {
    }

    public Manager(String username, Computer computer) {
        this.username = username;
        this.computer = computer;
    }

    public Manager(String firstname, String lastname, String username, Computer computer) {
        super(firstname, lastname);
        this.username = username;
        this.computer = computer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void use(){
        System.out.println(firstname+" "+lastname+" the manager, I'use a computer");
    }

    public void getInfo() {
        System.out.println( "Manager{" +
                "username='" + username + '\'' +
                ", computer=" + computer +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }
}
