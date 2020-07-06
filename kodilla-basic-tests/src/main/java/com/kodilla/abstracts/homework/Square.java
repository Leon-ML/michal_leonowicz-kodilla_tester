package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square() {
        super(4, 4);
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

