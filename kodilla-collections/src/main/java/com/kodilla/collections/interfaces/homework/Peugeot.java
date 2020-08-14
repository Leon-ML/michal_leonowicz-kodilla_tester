package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    private int speed;

    public Peugeot (int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getBrand() {
        return "Peugeot";
    }

    @Override
    public int getFinalSpeed() {
        return 110;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Peugeot przyspieszył o 30km/h");

    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Peugeot zwolnił o 20km/h");

    }
}
