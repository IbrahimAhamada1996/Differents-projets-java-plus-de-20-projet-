package com.saraya.cars;

import com.saraya.users.Driver;

public class Bus {

    private String matricule;
    private Integer numberOfPassenger;
    private Driver driver;

    public Bus() {
    }
    public Bus(String matricule, Integer numberOfPassenger) {
        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
    }
    public Bus(String matricule, Integer numberOfPassenger, Driver driver) {
        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
        this.driver = driver;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        if (matricule.length()>=5)
            this.matricule = matricule;
    }

    public Integer getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(Integer numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void getInfo() {
        System.out.println( "Bus{" +
                "matricule='" + matricule + '\'' +
                ", numberOfPassenger=" + numberOfPassenger +
                ", driver=" + driver +
                '}');
    }
}
