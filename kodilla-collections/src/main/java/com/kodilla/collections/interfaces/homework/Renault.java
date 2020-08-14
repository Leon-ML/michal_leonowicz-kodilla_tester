package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {


    private int speed;

    public Renault(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public String getBrand() {
        return "Renault";
    }

    @Override
    public int getFinalSpeed() {
        return speed + 10;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Renault przyspieszył o 10km/h.");

    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Renault zwolnił o 10km/h.");

    }
}

