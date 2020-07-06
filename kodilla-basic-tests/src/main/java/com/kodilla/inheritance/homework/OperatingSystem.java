package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn(){
        System.out.println("System turned on");
    }

    public void turnOff(){
        System.out.println("System turned off");
    }

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayYearOfRelease() {
        System.out.println("Year of release: " + year);
    }
}