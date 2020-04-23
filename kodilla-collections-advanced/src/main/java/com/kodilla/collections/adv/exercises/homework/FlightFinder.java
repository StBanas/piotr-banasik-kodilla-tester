package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;

public class FlightFinder {
    List<Flight> flights = new ArrayList<>();
    Map<Airport, List<Flight>> flightList = new HashMap<>(); ;

    public List<Flight> findFlightsFrom(Airport airport, String departure) { // wyjęte z nawiasu arg = Map flightTable,
        List<Flight> result = new ArrayList<>();
        for (Flight From : flights) {
            if (From.getDeparture().equals(departure)) {
                result.add(From);
            }
        }
        return result;
        }

    public List<Flight> findFlightsTo(Airport airport, String arrival) {           // Map flightTable,
        List<Flight> result = new ArrayList<>();
        for (Flight To : flights) {
            if (To.getArrival().equals(arrival)) {
                result.add(To);
            }
        }
        return result;
    }
}





