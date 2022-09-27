package com.somare;

import java.awt.*;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota","R4", Color.blue,"45A-OP");

        System.out.println(car1.toString());

        Car car2 = new Car();
        car2.setMarque("Mercedece");
        car2.setModel("MP7-X");
        car2.setColor(Color.GREEN);
        car2.setMatricule("45-RT");
        System.out.println(car2.toString());
    }
}
