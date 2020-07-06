package com.kodilla.abstracts.homework;

public class RectTriangle extends Shape{

    private int c = 4;

    public RectTriangle() {
        super(2, 5);
    }

    @Override
    public int getPole() {
        return a*b;
    }

    @Override
    public int getObwod() {
        return (a+b)*c/2;
    }
}
