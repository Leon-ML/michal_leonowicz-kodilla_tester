package com.kodilla.inheritance.homework;

public class SysApp {

    public static void main(String[] args) {
        OperatingSystem Win95 = new OperatingSystem(1995);
        OperatingSystem Win98 = new OperatingSystem(1998);
        OperatingSystem WindowsNT = new OperatingSystem(2000);
        OperatingSystem WindowsVista = new OperatingSystem(2005);

        Win95.turnOn();
        Win95.displayYearOfRelease();
        Win95.turnOff();

    }
}