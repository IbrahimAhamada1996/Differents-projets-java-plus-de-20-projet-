package com.saraya.cars;

import com.saraya.users.Client;
import com.saraya.users.Driver;

public class PersonalCar {

    private String matricule;
    private Integer numberOfPassenger;
    private Boolean withDriver;
    private Driver driver;
    private Client client;

    public PersonalCar() {
    }

    public PersonalCar(String matricule, Integer numberOfPassenger, Boolean withDriver) {
        this.matricule = matricule;
        this.numberOfPassenger = numberOfPassenger;
        this.withDriver = withDriver;
    }

    public PersonalCar(String matricule, Integer numberOfPassenger, Boolean withDriver, Driver driver) {
        this.matricule = matricule;
        this.numberOfPassenger = numberOfPassenger;
        this.withDriver = withDriver;
        this.driver = driver;
    }

    public PersonalCar(String matricule, Integer numberOfPassenger, Boolean withDriver, Driver driver, Client client) {
        this.setMatricule(matricule);
        this.numberOfPassenger = numberOfPassenger;
        this.withDriver = withDriver;
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

    public Boolean getWithDriver() {
        return withDriver;
    }

    public void setWithDriver(Boolean withDriver) {
        this.withDriver = withDriver;
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
        System.out.println("matricule   numberOfPenssengers  Driver's Full Name  Client Full Name");

        System.out.println(matricule+"        "+numberOfPassenger+"                "+driver.getFullName()  +"    "+client.getFullName());
    }
}
