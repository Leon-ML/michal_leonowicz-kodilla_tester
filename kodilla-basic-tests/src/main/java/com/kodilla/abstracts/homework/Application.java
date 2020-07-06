package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Shape square = new Square();
        ShapeProcessor processor = new ShapeProcessor();
        System.out.println("Kwadrat o boku 4.");
        processor.process(square);

        Shape recTriangle = new RectTriangle();
        ShapeProcessor processor1 = new ShapeProcessor();
        System.out.println("Prostokat o bokach 4 i 6.");
        processor1.process(recTriangle);

        Shape rectangular = new Rectangular();
        ShapeProcessor processor2 = new ShapeProcessor();
        System.out.println("Trójkąt prostokątny o bokach 2, 5, 4.");
        processor2.process(rectangular);
    }
}
