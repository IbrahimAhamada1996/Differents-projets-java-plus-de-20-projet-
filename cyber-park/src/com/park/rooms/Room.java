package com.park.rooms;

import com.park.users.Manager;

public class Room {

    private String name;
    private Integer number;
    private Integer numberOfComputers=0;
    private Manager manager;

    public Room() {
    }

    public Room(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Room(String name, Integer number, Integer numberOfComputers, Manager manager) {
        this.name = name;
        this.number = number;
        this.numberOfComputers = numberOfComputers;
        this.manager = manager;
    }

    public Room(String name, Integer number, Manager manager) {
        this.name = name;
        this.number = number;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(Integer numberOfComputers) {
        this.numberOfComputers += numberOfComputers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void getInfo() {
        System.out.println("Room{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", numberOfComputers=" + numberOfComputers +
                ", manager=" + manager +
                '}');
    }
}
