package com.kodilla.collections.adv.exercises.homework;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;
import com.kodilla.collections.adv.exercises.homework.Flight;


import java.util.*;

public class FlightFinder {

    Map<Airport, List<Flight>> connections = new HashMap<>();

    public List<Flight> findFlightsFrom( FlightRepository arrival,String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight whereFrom : connections.getOrDefault(departure, Collections.emptyList())) {
            if (whereFrom.getArrival().equals(departure)) {       //co ja tu chciałem?
                result.add(whereFrom);
            }
        }
        return result;
        }

    public List<Flight> findFlightsTo( FlightRepository departure,String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight whereFrom : connections.getOrDefault(arrival, Collections.emptyList())) {
            if (whereFrom.getArrival().equals(arrival)) {       //co ja tu chciałem?
            }
        }return result;
    }


    public static void main(String[] args) {
        FlightRepository connection = new FlightRepository();
        Flight arrival = new Flight("Warszawa", "London");
//        connection.addConnection(Airport.WAW, arrival);

//        Airport depAirport2 = Airport.KRK;
//        Flight arrival2 = new Flight("Warszawa", "Kraków");
//        Airport  depAirport3= Airport.WAW;
//        Flight arrival3 = new Flight("Warszawa", "Tokio");
//        connection.addConnection(depAirport2, arrival2);
//        connection.addConnection(depAirport3, arrival3);
        FlightRepository flight = new FlightRepository();
        flight.addConnection(Airport.WAW, new Flight("Londyn", "Warszawa"));
        flight.addConnection(Airport.LDN, new Flight("Warszawa", "Londyn"));
//        flight.addConnection(Airport.LDN, new Flight("Warszawa", "Londyn"));  // test na uniqueness required

//        System.out.println(FlightRepository.getFlightsTable(Airport.LDN));
//        System.out.println(FlightRepository.getFlightsTable(Airport.WAW));
//        System.out.println(FlightRepository.getFlightsTable(Airport.KRK));

        System.out.println( arrival.getDeparture() + arrival.getArrival());
        System.out.println(Airport.WAW);
    }
}





