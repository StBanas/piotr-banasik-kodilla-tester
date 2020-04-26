package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    List<Flight> flights;

    public FlightRepository(List<Flight> flights) {
        this.flights = flights;
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }

    public static List<Flight> flightList = new ArrayList<>();

    public void addFlights(String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
        checkCorrectness(flight);
    }

    public void checkCorrectness(Flight flight) {
        if (flight.getDeparture().equals(flight.getArrival())) {
            System.out.println("This flight can't be added");
        } else {
            checkUniqueness(flight);
        }
    }

    public void checkUniqueness(Flight flight) {
        boolean isUnique = true;
        for (Flight f : flights) {
            if (f.equals(flight)) {
                System.out.println("This flight is already on the list");
                isUnique = false;
            }
        }
        if (isUnique) {
            flights.add(flight);
        }
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public static void main(String[] args) {
        FlightRepository repository0 = new FlightRepository(flightList);
        repository0.addFlights("KRK", "LDN");
        repository0.addFlights("KRK", "WAW");
        repository0.addFlights("WAW", "LDN");
        repository0.addFlights("WAW", "KRK");
        repository0.addFlights("LDN", "WAW");
        repository0.addFlights("LDN", "KRK");


    }
}