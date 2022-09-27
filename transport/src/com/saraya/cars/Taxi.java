package com.saraya.cars;

import com.saraya.users.Client;
import com.saraya.users.Driver;

public class Taxi {

    private String matricule;
    private Integer numberOfPassenger;
    private Driver driver;
    private Client client;

    public Taxi() {
    }

    public Taxi(String matricule, Integer numberOfPassenger) {
        this.matricule = matricule;
        this.numberOfPassenger = numberOfPassenger;
    }

    public Taxi(String matricule, Integer numberOfPassenger, Driver driver) {
        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
        this.driver = driver;
    }

    public Taxi(String matricule, Integer numberOfPassenger, Client client) {
        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
        this.client = client;
    }

    public Taxi(String matricule, Integer numberOfPassenger, Driver driver, Client client) {

        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
        this.driver = driver;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void getInfo() {
        System.out.println("Taxi{" +
                "matricule='" + matricule + '\'' +
                ", numberOfPassenger=" + numberOfPassenger +
                ", driver=" + driver +
                ", client=" + client +
                '}');
    }
}
