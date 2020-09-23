package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public static List<Flight> findFlightsFrom(String searchedDeparture){
        List <Flight> departureTable = new ArrayList<>();
        for (Flight departure : FlightRepository.getFlightList()){
            if(departure.getDeparture().equals(searchedDeparture)){
                departureTable.add(departure);
            }
        }
        return departureTable;
    }
    public static List<Flight> findFlightsTo(String searchedArrival){
        List <Flight> arrivalTable = new ArrayList<>();
        for (Flight arrival : FlightRepository.getFlightList()){
            if(arrival.getArrival().equals(searchedArrival)) {
                arrivalTable.add(arrival);
            }
        }
        return arrivalTable;
    }
}
