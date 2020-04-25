package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testaddFlight() {
        flightList.clear();
        Flight flight = new Flight("WAW","KRK");
        flightList.add(flight);

        FlightRepository connections = new FlightRepository(flightList);
        int result = flightList.size();
        assertEquals(1, result);
    }

    @Test
    void testaddExistingFlight() {
        flightList.clear();

        Flight flight = new Flight("WAW","KRK");
        flightList.add(flight);

        int result1 = flightList.size();
        assertEquals(1, result1);

        Flight flight2 = new Flight("WAW","KRK");
        flightList.add(flight);
        int result2 = flightList.size();

        assertEquals(2, result2); // TODO -uniqueness
    }

    @Test
    void testaddNotCorrectConnection() {
        flightList.clear();

        FlightRepository repository = new FlightRepository(flightList);
        repository.addFlights("KRK","LDN");
        repository.addFlights("KRK","KRK");  //TODO - correctness

        int result = flightList.size();
        assertEquals(1, result);
    }

    @Test
    void testFindDeparting_FromTheAirport() {
        //given
        flightList.clear();
        FlightRepository repository = new FlightRepository(flightList);
        repository.addFlights("KRK","LDN");
        repository.addFlights("KRK","WAW");
        repository.addFlights("WAW","LDN");
        repository.addFlights("WAW","KRK");
        repository.addFlights("LDN","WAW");
        repository.addFlights("LDN","KRK");

        //when
        FlightFinder finder = new FlightFinder(flightList);
        List<Flight> departures = finder.findFlightsFrom("WAW");
        //then
        assertEquals(2, departures.size());
    }

    @Test
    void testFindFlightsArriving_ToTheAirport() {
        //given
        flightList.clear();
        FlightRepository repository0 = new FlightRepository(flightList);

        repository0.addFlights("KRK","LDN");
        repository0.addFlights("KRK","WAW");
        repository0.addFlights("WAW","LDN");
        repository0.addFlights("WAW","KRK");
        repository0.addFlights("LDN","WAW");
        repository0.addFlights("LDN","KRK");

        //when
        FlightFinder finder = new FlightFinder(flightList);
        List<Flight> arrivals = finder.findFlightsTo("WAW");
        //then
        assertEquals(2, arrivals.size());
    }
}