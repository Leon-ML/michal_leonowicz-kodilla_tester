package com.kodilla.collections.interfaces.homework;

public class Citroen implements Car {

    private int speed;


    public Citroen (int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getBrand() {
        return "Citroen";
    }

    @Override
    public int getFinalSpeed() {
        return 46;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Citroen przyspieszył o 22km/h");

    }


    @Override
    public void decreaseSpeed() {
        System.out.println("Citroen zwolnił o 20km/h");
    }

    @Override
    public String toString() {
        return "Citroen{" +
                "speed=" + speed +
                '}';
    }
}
