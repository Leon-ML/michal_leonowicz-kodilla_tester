package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {

    private double speed;

    public Renault (double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed + 30;

    }

    @Override
    public double decreaseSpeed() {
        return speed - 20;

    }
}
