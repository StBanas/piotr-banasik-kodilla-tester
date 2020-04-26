package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testaddFlight() {
        //given
        getFlightList().clear();
        FlightRepository repository = new FlightRepository(getFlightList());
        repository.addFlights("WAW", "KRK");

        //when
        int result = getFlightList().size();
        //then
        assertEquals(1, result);
    }

    @Test
    void testaddExistingFlight() {
        //given
        getFlightList().clear();
        FlightRepository connections = new FlightRepository(getFlightList());
        connections.addFlights("WAW", "KRK");

        //when
        int result1 = getFlightList().size();
        //then
        assertEquals(1, result1);


        //given II
        connections.addFlights("WAW", "KRK");

        //when II
        int result2 = getFlightList().size();
        //then II
        assertEquals(1, result2);
    }

    @Test
    void testaddNotCorrectConnection() {
        //given
        getFlightList().clear();
        FlightRepository repository = new FlightRepository(getFlightList());
        repository.addFlights("KRK", "LDN");
        repository.addFlights("KRK", "KRK");

        //when
        int result = getFlightList().size();
        //then
        assertEquals(1, result);
    }

    @Test
    void testFindDeparting_FromTheAirport() {
        //given
        getFlightList().clear();
        FlightRepository repository = new FlightRepository(getFlightList());
        repository.addFlights("KRK", "LDN");
        repository.addFlights("KRK", "WAW");
        repository.addFlights("WAW", "LDN");
        repository.addFlights("WAW", "KRK");
        repository.addFlights("LDN", "WAW");
        repository.addFlights("LDN", "KRK");

        //when
        FlightFinder finder = new FlightFinder(getFlightList());
        List<Flight> departures = finder.findFlightsFrom("WAW");
        //then
        assertEquals(2, departures.size());
    }

    @Test
    void testFindFlightsArriving_ToTheAirport() {
        //given
        getFlightList().clear();
        FlightRepository repository0 = new FlightRepository(getFlightList());
        repository0.addFlights("KRK", "LDN");
        repository0.addFlights("KRK", "WAW");
        repository0.addFlights("WAW", "LDN");
        repository0.addFlights("WAW", "KRK");
        repository0.addFlights("LDN", "WAW");
        repository0.addFlights("LDN", "KRK");

        //when
        FlightFinder finder = new FlightFinder(getFlightList());
        List<Flight> arrivals = finder.findFlightsTo("WAW");
        //then
        assertEquals(2, arrivals.size());
    }
}