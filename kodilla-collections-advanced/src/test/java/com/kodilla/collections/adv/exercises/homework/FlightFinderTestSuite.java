package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testaddConnection() {
        FlightRepository connections = new FlightRepository(Airport.LDN, flightTable);
        Flight departure = new Flight("Warszawa", "Kraków");
//        connections.addConnection(Airport.WAW, flightList);
        connections.addFlight("Warszawa", "Kraków");
        int result = flightList.size();
        assertEquals(1, result);
    }

    @Test
    void testaddExistingConnection() {
        FlightRepository connections = new FlightRepository(Airport.LDN,flightTable);
        Airport airport = Airport.WAW;
        Flight departure = new Flight("Warszawa", "Kraków");
        connections.addConnection(airport, flightList);
        connections.addFlight("Warszawa", "Kraków");
        int result1 = flightList.size();

        Airport airport1 = Airport.WAW;
        Flight departure1 = new Flight("Warszawa", "Kraków");
        connections.addConnection(airport1, flightList);
        System.out.println(flightTable);
        System.out.println(flightList);
        int result2 = flightList.size();
        assertEquals(1, result1);
        assertEquals(1, result2);
    }

    @Test
    void testaddNotCorrectConnection() {
        FlightRepository repository = new FlightRepository(Airport.KRK, flightTable);
        System.out.println(flightList);


        repository.addFlight("KRK","LDN");
        repository.addFlight("KRK","KRK");
//        repository.addConnection(Airport.KRK,flightList);
        FlightFinder finder = new FlightFinder(flightTable);

//        List<Flight> departures2 = finder.findFlightsTo(flightTable,"KRK");

        List<Flight> arrivals = finder.findFlightsFrom(flightTable,"KRK");
        System.out.println(flightList);
//        assertEquals(2, departures2.size(),0.01);
        assertEquals(1, arrivals.size());

    }

    @Test
    void testFindDepartures_FromTheAirport() {
        //given
        FlightRepository repository = new FlightRepository(Airport.WAW, flightTable);

        repository.addFlight("KRK","LDN");
        repository.addFlight("KRK","WAW");
        repository.addFlight("WAW","LDN");
        repository.addFlight("WAW","KRK");
        repository.addFlight("LDN","WAW");
        repository.addFlight("LDN","KRK");

        repository.addConnection(Airport.KRK,flightList);
//        repository.addConnection(Airport.WAW,flightList);

        FlightFinder finder = new FlightFinder(flightTable);

        //when
        List<Flight> departures = finder.findFlightsTo(flightTable,"WAW");
//        List<Flight> departures1 = finder.findFlightsTo(flightTable,"LDN");
//        List<Flight> departures2 = finder.findFlightsTo(flightTable,"KRK");
        //then
        assertEquals(2, departures.size());
//        assertEquals(2, departures1.size());
//        assertEquals(2, departures2.size());
    }
    @Test
    void testFindFlightsArriving_ToTheAirport() {
        //given
        FlightRepository repository = new FlightRepository(Airport.WAW, flightTable);

        repository.addFlight("KRK","LDN");
        repository.addFlight("KRK","WAW");
        repository.addFlight("WAW","LDN");
        repository.addFlight("WAW","KRK");
        repository.addFlight("LDN","WAW");
        repository.addFlight("LDN","KRK");

        repository.addConnection(Airport.KRK,flightList);
//        repository.addConnection(Airport.WAW,flightList);

        FlightFinder finder = new FlightFinder(flightTable);

        //when
        List<Flight> arrivals = finder.findFlightsFrom(flightTable,"WAW");
//        List<Flight> arrivals1 = finder.findFlightsFrom(flightTable,"LDN");
//        List<Flight> arrivals2 = finder.findFlightsFrom(flightTable,"KRK");

        //then
        assertEquals(2, arrivals.size());
//        assertEquals(5, arrivals1.size());
//        assertEquals(3, arrivals2.size());
    }
}