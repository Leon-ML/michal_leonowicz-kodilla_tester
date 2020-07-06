package com.kodilla.inheritance.homework;

public class WinSys extends OperatingSystem {

    public WinSys(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("WinSys is taking over.");
    }
}
