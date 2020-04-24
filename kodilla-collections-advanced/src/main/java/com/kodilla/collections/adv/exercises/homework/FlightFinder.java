package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;

public class FlightFinder {
    List<Flight> flightList;  // = new ArrayList<>();
    public FlightFinder( List<Flight> flightslist) {
        this.flightList = flightslist;
    }

    public List<Flight> findFlightsTo(String departure) {
        List<Flight> result = new ArrayList<>();
            for (Flight From : flightList) {
                if (From.getDeparture().equals(departure)) {
                    result.add(From);
                }
            }
            return result;
        }



        public List<Flight> findFlightsFrom(String arrival ) {
            List<Flight> result = new ArrayList<>();
            for (Flight From : flightList) {
                if (From.getArrival().equals(arrival)) {
                    result.add(From);
                }
            }
            return result;
        }

//
//                List<Flight> result = new ArrayList<>();
//                for (Flight To : flightList) {
//                    if (To.getDeparture().equals(arrival)) {
//                        result.add(To);
//                    }
//                }
//                return result;
//            }
//

}







