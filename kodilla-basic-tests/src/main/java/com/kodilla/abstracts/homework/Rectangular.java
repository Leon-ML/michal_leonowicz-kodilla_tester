package com.kodilla.abstracts.homework;

public class Rectangular extends Shape{

    public Rectangular() {
        super(4, 6);
    }

    @Override
    public int getPole() {
        return a*b;
    }

    @Override
    public int getObwod() {
        return (a+b)*2;
    }
}
