package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    private double speed;

    public Peugeot (double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override // program zaproponował mi zamianę voidów na double, wiec metoda nie jest taka jaka powinna być
    public double increaseSpeed() {
        return speed + 30;

    }

    @Override
    public double decreaseSpeed() {
        return speed - 20;

    }
}
