package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testaddConnection(){
        FlightRepository connections = new FlightRepository();
        Airport airport = Airport.WAW;
        Flight departure = new Flight("Warszawa", "Kraków");
        connections.addConnection(airport,departure);

        Airport airport1 = Airport.KRK;
        System.out.println(departure);

        Flight departure1 = new Flight("Kraków", "Warszawa");
        System.out.println(departure1);
    }
    @Test
    void testaddExistingConnection() {
        FlightRepository connections = new FlightRepository();
        Airport airport = Airport.WAW;
        Flight departure = new Flight("Warszawa", "Kraków");
        connections.addConnection(airport, departure);
        Airport airport1 = Airport.WAW;
        Flight departure1 = new Flight("Warszawa", "Kraków");
        connections.addConnection(airport, departure);
    }
    @Test
    void testaddNotExistingConnection() {
        FlightRepository connections = new FlightRepository();
        Airport airport = Airport.KRK;
        Flight departure = new Flight("Warszawa", "London");
        connections.addConnection(airport, departure);
    }
    @Test
    List<Flight> findFlightsFrom() {
        FlightRepository connections = new FlightRepository();
        Airport airport = Airport.KRK;
        Flight departure = new Flight("Warszawa", "London");
        connections.addConnection(airport, departure);
        List<Flight> result = new ArrayList<>();
        result.add(departure);
        return result;
    }

    @Test
    void findFlightsTo() {
        FlightRepository connections = new FlightRepository();
        Airport airport = Airport.KRK;
        Flight departure = new Flight("Warszawa", "London");
        connections.addConnection(airport, departure);

    }
    @Test
    void testFindFlightsFrom_ToTheAirport() {
        //given
//        Map<Airport, List<Flight>> connections = new HashMap<>();
        FlightRepository connections = new FlightRepository();
        connections.addConnection(Airport.LDN, new Flight("Warszawa", "Londyn"));
        connections.addConnection(Airport.LDN, new Flight("Kraków", "Londyn"));
        connections.addConnection(Airport.LDN, new Flight("Londyn", "Warszawa"));
        connections.addConnection(Airport.LDN, new Flight("Londyn", "Kraków"));
        connections.addConnection(Airport.WAW, new Flight("Warszawa", "Londyn"));
        connections.addConnection(Airport.WAW, new Flight("Kraków", "Warszawa"));
        connections.addConnection(Airport.WAW, new Flight("Londyn", "Warszawa"));
        connections.addConnection(Airport.WAW, new Flight("Warszawa", "Kraków"));
        connections.addConnection(Airport.KRK, new Flight("Warszawa", "Kraków"));
        connections.addConnection(Airport.KRK, new Flight("Kraków", "Warszawa"));
        connections.addConnection(Airport.KRK, new Flight("Londyn", "Kraków"));
        connections.addConnection(Airport.KRK, new Flight("Kraków", "Londyn"));

        //when
        List<Flight> result = findFlightsFrom();
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Londyn"));
        assertEquals(expectedList, result);
    }
}