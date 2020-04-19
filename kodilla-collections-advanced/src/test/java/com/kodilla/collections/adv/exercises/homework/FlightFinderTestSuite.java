package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

//    @Test
//    void testaddConnection() {
//        FlightRepository connections = new FlightRepository();
//        Airport airport = Airport.WAW;
//        Flight departure = new Flight("Warszawa", "Kraków");
//        connections.addConnection(airport, departure);
//
//        Airport airport1 = Airport.KRK;
//        System.out.println(departure);
//
//        Flight departure1 = new Flight("Kraków", "Warszawa");
//        System.out.println(departure1);
//    }
//
//    @Test
//    void testaddExistingConnection() {
//        FlightRepository connections = new FlightRepository();
//        Airport airport = Airport.WAW;
//        Flight departure = new Flight("Warszawa", "Kraków");
//        connections.addConnection(airport, departure);
//        Airport airport1 = Airport.WAW;
//        Flight departure1 = new Flight("Warszawa", "Kraków");
//        connections.addConnection(airport, departure);
//    }
//
//    @Test
//    void testaddNotExistingConnection() {
//        FlightRepository connections = new FlightRepository();
//        Airport airport = Airport.KRK;
//        Flight departure = new Flight("Warszawa", "Londyn");
//        connections.addConnection(airport, departure);
//    }
//
//    @Test
//    void  findFlightsFrom() {
//        FlightRepository connections = new FlightRepository();
//        Airport airport = Airport.KRK;
//        Flight departure = new Flight("Warszawa", "London");
//        connections.addConnection(airport, departure);
//        List<Flight> result = new ArrayList<>();
//        result.add(departure);
//    }
//
//
//    @Test
//    void findFlightsTo() {
//        FlightRepository connections = new FlightRepository();
//        Airport airport = Airport.KRK;
//        Flight departure = new Flight("Warszawa", "London");
//        connections.addConnection(airport, departure);
//
//    }
//    @Test
//    void testFindFlightsFrom_ToTheAirport() {
//        //given
//        FlightRepository repository = new FlightRepository(Airport.WAW,flightTable);
//        repository.addConnection(Airport.WAW, flightList);
//        repository.addConnection(Airport.LDN, flightList);
//        repository.addConnection(Airport.KRK, flightList);
//
//        //when
//        FlightFinder finder = new FlightFinder(getFlightTable());
//
//        List<Flight> arrivals = finder.findFlightsFrom(getFlightTable(),"LDN");
//        //then
//        assertEquals(4, arrivals.size());
//    }
}