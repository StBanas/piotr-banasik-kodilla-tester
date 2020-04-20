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
    @Test
    void testFindFlightsFrom_ToTheAirport() {
        //given

        FlightRepository repository = new FlightRepository(Airport.WAW,flightTable);
        Flight flightLDN_WAW = new Flight("WAW", "LDN");
        Flight flightKRK_WAW = new Flight("WAW", "KRK");
        Flight flightWAW_LDN = new Flight("LDN", "WAW");
        Flight flightKRK_LDN = new Flight("LDN", "KRK");
        Flight flightLDN_WAW2 = new Flight("WAW", "LDN");
        Flight flightWAW_KRK = new Flight("KRK", "WAW");
        Flight flightLDN_KRK = new Flight("KRK", "LDN");
        Flight flightKRK_WAW2 = new Flight("WAW", "KRK");
        flightKRK_LDN.addFlight("WAW", "LDN");
        flightKRK_LDN.addFlight("WAW", "KRK");
        flightKRK_LDN.addFlight("LDN", "WAW");
        flightKRK_LDN.addFlight("KRK", "LDN");


        repository.addConnection(Airport.WAW, flightList);
        repository.addConnection(Airport.LDN, flightList);
        repository.addConnection(Airport.KRK, flightList);

        //when
        FlightFinder finder = new FlightFinder(getFlightTable());

        List<Flight> arrivals = finder.findFlightsFrom(getFlightTable(),"LDN");
        //then
        assertEquals(4, arrivals.size());
    }
}