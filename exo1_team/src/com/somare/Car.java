package com.somare;

import java.awt.*;

public class Car {

    private String marque;
    private String model;
    private Color color;
    private String matricule;

    public Car() {
    }

    public Car(String marque, String model, Color color, String matricule) {
        this.marque = marque;
        this.model = model;
        this.color = color;
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }
}
