package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;

public class FlightFinder {
    Map airportTable;

    public FlightFinder(Map airportTable) {
        this.airportTable = airportTable;
    }

    public List<Flight> findFlightsFrom(Map getFlightTable, String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight From : getFlightList()) {
            if (From.getDeparture().equals(departure)) {       //co ja tu chciałem?
                result.add(From);
            }
        }
        return result;
        }

    public List<Flight> findFlightsTo( Map getFlightTable, String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight To : getFlightList()) {
            if (To.getArrival().equals(arrival)) {
                result.add(To);                               //co ja tu chciałem?
            }
        }
        return result;
    }
}





