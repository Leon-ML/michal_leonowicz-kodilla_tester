package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightList() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Cracow"));
        flightList.add(new Flight("Rzeszow", "Gdansk"));
        flightList.add(new Flight("Warsaw", "Poznan"));
        flightList.add(new Flight("Cracow", "Gdansk"));
        return flightList;
    }
}
