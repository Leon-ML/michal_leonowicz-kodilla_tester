package com.kodilla.inheritance.homework;

public class Bios extends OperatingSystem {

    public Bios(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Bios is shutting down.");
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Bios is booting.");
    }
}
