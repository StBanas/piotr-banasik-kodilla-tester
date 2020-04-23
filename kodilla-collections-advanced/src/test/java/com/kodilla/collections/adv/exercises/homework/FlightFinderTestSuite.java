package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testaddConnection() {

        FlightRepository connections = new FlightRepository(Airport.LDN, flightTable);
        connections.addFlight(Airport.LDN,"WAW", "KRK");
        connections.addFlight(Airport.LDN,"LDN", "KRK");
        int result = flightList.size();
        assertEquals(2, result);
    }

    @Test
    void testaddExistingConnection() {
        FlightRepository connections = new FlightRepository(Airport.LDN,flightTable);
        Airport airport = Airport.WAW;
        Flight departure = new Flight(Airport.WAW, "WAW","KRK");
        connections.addConnection(airport, flightList);
        connections.addFlight(Airport.WAW,"WAW", "KRK");
        int result1 = flightList.size();

        Airport airport1 = Airport.WAW;
        Flight departure1 = new Flight(Airport.WAW, "WAW","KRK");
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
        repository.addFlight(Airport.KRK,"KRK","LDN");
        repository.addFlight(Airport.KRK,"KRK","KRK");

        FlightFinder finder = new FlightFinder();
        List<Flight> arrivals = finder.findFlightsFrom(Airport.KRK,"KRK");    //flightTable,
        System.out.println(flightList.size());
        assertEquals(0, arrivals.size());

    }

    @Test
    void testFindDepartures_FromTheAirport() {
        //given
        FlightRepository repository = new FlightRepository(Airport.WAW, flightTable);

        repository.addFlight(Airport.KRK,"KRK","LDN");
        repository.addFlight(Airport.KRK,"KRK","WAW");
        repository.addFlight(Airport.WAW,"WAW","LDN");
        repository.addFlight(Airport.WAW,"WAW","KRK");
        repository.addFlight(Airport.LDN,"LDN","WAW");
        repository.addFlight(Airport.LDN,"LDN","KRK");

        repository.addConnection(Airport.KRK,flightList);
        repository.addConnection(Airport.WAW,flightList);
        repository.addConnection(Airport.LDN,flightList);

        FlightFinder finder = new FlightFinder();

        //when
        List<Flight> departures = finder.findFlightsTo(Airport.WAW,"WAW");  //flightTable,
        //then
        assertEquals(2, departures.size());
    }

    @Test
    void testFindFlightsArriving_ToTheAirport() {
        //given
        FlightRepository repository = new FlightRepository(Airport.WAW, flightTable);

        repository.addFlight(Airport.KRK,"KRK","LDN");
        repository.addFlight(Airport.KRK,"KRK","WAW");
        repository.addFlight(Airport.WAW,"WAW","LDN");
        repository.addFlight(Airport.WAW,"WAW","KRK");
        repository.addFlight(Airport.LDN,"LDN","WAW");
        repository.addFlight(Airport.LDN,"LDN","KRK");

//        repository.addConnection(Airport.KRK,flightList);
//        repository.addConnection(Airport.WAW,flightList);

        FlightFinder finder = new FlightFinder();

        //when
        List<Flight> arrivals = finder.findFlightsFrom(Airport.WAW,"WAW");    // flightTable,
//        List<Flight> arrivals1 = finder.findFlightsFrom(flightTable,"LDN");
//        List<Flight> arrivals2 = finder.findFlightsFrom(flightTable,"KRK");

        //then
        assertEquals(2, arrivals.size());
//        assertEquals(5, arrivals1.size());
//        assertEquals(3, arrivals2.size());
    }
}