package com.saraya;

import com.saraya.cars.Bus;
import com.saraya.cars.PersonalCar;
import com.saraya.cars.Taxi;
import com.saraya.users.Client;
import com.saraya.users.Driver;

public class App {

    public static void main(String[] args) {

        Taxi taxi1 = new Taxi("DK-0865-ZQ",4);
        Taxi taxi2 = new Taxi("DK-0865-ZQ",4);

        PersonalCar personalCar1 = new PersonalCar("DK-70455-IO",8,false);
        PersonalCar personalCar2 = new PersonalCar("DK-7455-PO",8,true);

        Bus bus1 = new Bus("DK-7455-MM",5);
        Bus bus2 = new Bus("DK-7455-LO",5);

        //***************************************************************
        Driver driver1 = new Driver("057PP-OP","Ibrahim Ali",5000);
        Driver driver2 = new Driver("757PP-OP","Salim Omar",856220);
        Driver driver3 = new Driver("957PP-OP","Hamza Ahamada",500880);
        Driver driver4 = new Driver("657PP-OP","Sara M'sa",15000);
        Driver driver5 = new Driver("357PP-OP","Awa Ahamada",95000);
        Driver driver6 = new Driver("257PP-OP","Fatima Ndae",75000);



        Client client1 = new Client("MPL-E55","Ibrahim Ahamada","liberté 6 ext","ibrahim@gmail.com");
        Client client2 = new Client("QTY-E55","Omar Hassane","Sam","omar@gmail.com");


        taxi1.setDriver(driver1);
        taxi1.setClient(client1);
        bus1.setDriver(driver1);


        personalCar1.setDriver(driver1);
        personalCar1.setClient(client1);

        personalCar2.setDriver(driver2);
        personalCar2.setClient(client2);

        personalCar1.getInfo();
        personalCar2.getInfo();
    }
}
