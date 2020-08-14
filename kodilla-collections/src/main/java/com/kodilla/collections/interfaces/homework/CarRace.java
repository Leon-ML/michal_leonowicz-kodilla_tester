package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Peugeot peugeot = new Peugeot(60);
        doRace(peugeot);
        Renault renault = new Renault(50);
        doRace(renault);
        Citroen citroen = new Citroen( 40);
        doRace(citroen);
    }

    public static void doRace(Car car){
        System.out.println("Prędkość początkowa to: " + car.getSpeed());
    car.increaseSpeed();
    car.increaseSpeed();
    car.increaseSpeed();
    car.decreaseSpeed();
    car.decreaseSpeed();
        System.out.println("Prędkość końcowa to: " + car.getFinalSpeed());
    }
}
