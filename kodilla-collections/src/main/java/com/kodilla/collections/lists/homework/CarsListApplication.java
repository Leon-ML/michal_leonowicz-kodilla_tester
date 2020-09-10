package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Peugeot(50));
        cars.add(new Peugeot(70));
        cars.add(new Citroen(60));
        cars.add(new Renault(100));

        for (Car car : cars)
            CarUtils.describeCar(car);


        cars.remove(0);
        Peugeot peugeot = new Peugeot(70);
        cars.remove(peugeot);
        cars.size();

        for (Car car : cars)
            System.out.println(car);

    }
}
