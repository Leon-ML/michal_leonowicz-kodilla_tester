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
        results.add(new Flight("Warsaw","Cracow"));
        results.add(new Flight("Warsaw", "Poznan"));
        assertEquals(2,expectedDeparture.size());
        assertEquals(results, expectedDeparture);
    }
    @Test
    public void doesFindFlightsTo() {
        List<Flight> expectedArrival = FlightFinder.findFlightsTo("Gdansk");
        List<Flight> results = new ArrayList<>();
        results.add(new Flight("Rzeszow", "Gdansk"));
        results.add(new Flight("Cracow", "Gdansk"));
        assertEquals(2, expectedArrival.size());
        assertEquals(results, expectedArrival);
    }

}