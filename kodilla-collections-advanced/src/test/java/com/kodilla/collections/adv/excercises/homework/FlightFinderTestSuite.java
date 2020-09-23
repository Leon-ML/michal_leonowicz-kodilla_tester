package com.kodilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void doesFindFlightsFrom() {
        List<Flight> expectedDeparture = FlightFinder.findFlightsFrom("Warsaw");
        List<Flight> results = new ArrayList<>();
        results.add("Warsaw","Cracow");
        results.add("Warsaw", "Poznan");
        assertEquals(2,expectedDeparture.size());
    }
    @Test
    public void doesFindFlightsTo() {
        List<Flight> expectedArrival = FlightFinder.findFlightsTo("Gdansk");
        List<Flight> results = new ArrayList<>();
        results.add("Rzeszow", "Gdansk");
        results.add("Cracow", "Gdansk");
        assertEquals(2, expectedArrival.size());
    }

}