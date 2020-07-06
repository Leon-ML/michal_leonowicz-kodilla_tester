package com.kodilla.abstracts.homework;

public abstract class Shape {

    public int a;
    public int b;

    public Shape(int a, int b){
        this.a = a;
        this.b = b;
    }

    public abstract int getPole();


    public abstract int getObwod();


}
