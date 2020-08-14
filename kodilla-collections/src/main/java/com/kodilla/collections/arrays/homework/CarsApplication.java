package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;


public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++ )
            cars[n] = drawCar();
        for (Car car: cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        if (drawnCarKind == 0)
            return new Peugeot(a);
        else if (drawnCarKind == 1)
            return new Citroen(a);
        else
            return new Renault(a);
    }
}

