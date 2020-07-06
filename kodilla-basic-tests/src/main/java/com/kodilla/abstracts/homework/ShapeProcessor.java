package com.kodilla.abstracts.homework;


public class ShapeProcessor {

    public void process(Shape shape) {
        System.out.println("Obwod tej figury to " + shape.getObwod() + " a jej pole to " + shape.getPole());
        shape.getPole();
        shape.getObwod();
    }
}