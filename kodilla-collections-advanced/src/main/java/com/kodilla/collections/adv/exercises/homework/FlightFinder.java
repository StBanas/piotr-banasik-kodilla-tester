package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    List<Flight> flightList;  // = new ArrayList<>();
    public FlightFinder( List<Flight> flightslist) {
        this.flightList = flightslist;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
            for (Flight To : flightList) {
                if (To.getArrival().equals(arrival)) {
                    result.add(To);
                }
            }
            return result;
        }

        public List<Flight> findFlightsFrom(String departure ) {
            List<Flight> result = new ArrayList<>();
            for (Flight From : flightList) {
                if (From.getDeparture().equals(departure)) {
                    result.add(From);
                }
            }
            return result;
        }
}







