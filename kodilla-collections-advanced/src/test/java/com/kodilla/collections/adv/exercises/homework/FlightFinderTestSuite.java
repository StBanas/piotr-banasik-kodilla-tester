package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

//    @Test
//    void testaddConnection() {
//        Map<Airport,List<Flight>> connections = FlightRepository.getFlightTable();
////        Airport airport = Airport.WAW;
//        Flight departure = new Flight("Warszawa", "Kraków");
//        connections.addConnection(Airport.WAW, getFlightList());
//
//        Airport airport1 = Airport.LDN;
//        Flight departure1 = new Flight("LDN", "WAW");
//        connections.addConnection(airport, getFlightList());
//    }
//
//    @Test
//    void testaddExistingConnection() {
//        FlightRepository connections = new FlightRepository(getFlightTable());
//        Airport airport = Airport.WAW;
//        Flight departure = new Flight("Warszawa", "Kraków");
//        connections.addConnection(airport, getFlightList());
//
//        Airport airport1 = Airport.WAW;
//        Flight departure1 = new Flight("Warszawa", "Kraków");
//        connections.addConnection(airport1, getFlightList());
//
//
//    }

    @Test
    void testaddNotExistingConnection() {
        Map<Airport,List<Flight>> repository = FlightRepository.flightTable;

        FlightRepository.addFlight("KRK","KRK");
        FlightRepository.addConnection(Airport.KRK,flightList);

        FlightFinder finder = new FlightFinder(flightTable);

        List<Flight> departures2 = finder.findFlightsTo(flightTable,"KRK");

        List<Flight> arrivals = finder.findFlightsFrom(flightTable,"KRK");

        assertEquals(5, departures2.size(),0.01);
        assertEquals(4, arrivals.size(),0.01);





    }
    @Test
    void testFindDepartures_FromTheAirport() {
        //given
        Map<Airport,List<Flight>> repository = FlightRepository.flightTable;

        FlightRepository.addFlight("KRK","LDN");
        FlightRepository.addFlight("KRK","WAW");
        FlightRepository.addFlight("WAW","LDN");
        FlightRepository.addFlight("WAW","LDN");
        FlightRepository.addFlight("LDN","WAW");
        FlightRepository.addFlight("LDN","KRK");

        FlightRepository.addConnection(Airport.KRK,flightList);
        FlightRepository.addConnection(Airport.WAW,flightList);
        FlightRepository.addConnection(Airport.LDN,flightList);

        FlightFinder finder = new FlightFinder(flightTable);

        //when
        List<Flight> departures = finder.findFlightsTo(flightTable,"WAW");
        List<Flight> departures1 = finder.findFlightsTo(flightTable,"LDN");
        List<Flight> departures2 = finder.findFlightsTo(flightTable,"KRK");
        //then
        assertEquals(2, departures.size());
        assertEquals(2, departures1.size());
        assertEquals(2, departures2.size());
    }
    @Test
    void testFindFlightsArriving_ToTheAirport() {
        //given
        Map<Airport,List<Flight>> repository = FlightRepository.flightTable;

        FlightRepository.addFlight("KRK","LDN");
        FlightRepository.addFlight("KRK","WAW");
        FlightRepository.addFlight("WAW","LDN");
        FlightRepository.addFlight("WAW","KRK");
        FlightRepository.addFlight("LDN","WAW");
        FlightRepository.addFlight("LDN","KRK");

        FlightRepository.addConnection(Airport.KRK,flightList);
        FlightRepository.addConnection(Airport.WAW,flightList);
        FlightRepository.addConnection(Airport.LDN,flightList);

        FlightFinder finder = new FlightFinder(flightTable);

        //when
        List<Flight> arrivals = finder.findFlightsFrom(flightTable,"WAW");
//        List<Flight> arrivals1 = finder.findFlightsFrom(flightTable,"LDN");
//        List<Flight> arrivals2 = finder.findFlightsFrom(flightTable,"KRK");

        //then
        assertEquals(4, arrivals.size());
//        assertEquals(5, arrivals1.size());
//        assertEquals(3, arrivals2.size());
    }
}