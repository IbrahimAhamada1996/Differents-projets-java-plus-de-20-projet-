package com.park.materials;

public class Computer {

    private String ipAddres;
    private String make;
    private String model;

    public Computer() {
    }

    public Computer(String ipAddres, String make, String model) {
        this.ipAddres = ipAddres;
        this.make = make;
        this.model = model;
    }

    public String getIpAddres() {
        return ipAddres;
    }

    public void setIpAddres(String ipAddres) {
        this.ipAddres = ipAddres;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getInfo() {
        System.out.println( "Computer{" +
                "ipAddres='" + ipAddres + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}');
    }
}
