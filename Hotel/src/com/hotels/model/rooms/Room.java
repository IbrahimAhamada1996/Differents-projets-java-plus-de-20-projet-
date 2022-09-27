package com.hotels.model.rooms;

public class Room {
    private int id;
    private int maximCapacity;
    private int numberOfBed;
    private String typeOfRomm;
    private double price;
    private boolean status = true;

    public Room() {
    }

    public Room(int id, int maximCapacity, int numberOfBed, String typeOfRomm, double price) {
        this.id = id;
        this.maximCapacity = maximCapacity;
        this.numberOfBed = numberOfBed;
        this.typeOfRomm = typeOfRomm;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaximCapacity() {
        return maximCapacity;
    }

    public void setMaximCapacity(int maximCapacity) {
        maximCapacity = maximCapacity;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        numberOfBed = numberOfBed;
    }

    public String getTypeOfRomm() {
        return typeOfRomm;
    }

    public void setTypeOfRomm(String typeOfRomm) {
        this.typeOfRomm = typeOfRomm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "\tRoom id :" +id+'\n' +
                "\tMaxim Capacity : " + maximCapacity +'\n' +
                "\tNumber Of Bed : " + numberOfBed +'\n' +
                "\ttype Of Room : " + typeOfRomm + '\n' +
                "\tprice : " + price+'\n'
                ;
    }
}
