package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static Map<Airport, List<Flight>> getConnections() {
        return connections;
    }

    static Map<Airport, List<Flight>> connections = new HashMap<>();  // k: Airport wylotu , v: port docelowy

    public void addConnection(Airport departure, Flight arrival) {
        List<Flight> flights = connections.getOrDefault(departure, new ArrayList<>());
        flights.add(arrival);
        checkUniquness(arrival);
        connections.put(departure, flights);
    }

    public void checkUniquness(Flight arrival) {
        for ( List<Flight> newFlight : connections.values()) {
            for (int i=0; i<connections.size();i++)
                if (newFlight.equals(connections.get(i))){
                    System.out.println("This flight: " + newFlight + " can't be added.");
                    System.out.println(connections.get(i));
                    break;
                }
        }
    }
    public List<Flight> findFlightsFrom(String arrival, String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight whereFrom : connections.getOrDefault(departure, Collections.emptyList())) {
            if (whereFrom.getArrival().equals(departure)) {       //co ja tu chciałem?
                result.add(whereFrom);
            }
        }
        return result;
        }

    public List<Flight> findFlightsTo(Airport departure, String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight whereFrom : connections.getOrDefault(arrival, Collections.emptyList())) {
            if (whereFrom.getArrival().equals(arrival)) {       //co ja tu chciałem?
            }
        }return result;
    }
    public static List<Flight> getFlightsTable (Airport arrival) {
        List<Flight> result = new ArrayList<>();
        result.addAll(connections.getOrDefault(arrival, Collections.emptyList()));
        return result;
    }
    public static void main (String[] args) {

        FlightRepository flight = new FlightRepository();
        flight.addConnection(Airport.WAW, new Flight("Londyn", "Warszawa"));
        flight.addConnection(Airport.LDN, new Flight("Warszawa", "Londyn"));
        flight.addConnection(Airport.LDN, new Flight("Warszawa", "Londyn"));  // test na uniqueness required

        System.out.println(getFlightsTable(Airport.LDN));
        System.out.println(getFlightsTable(Airport.WAW));
        System.out.println(getFlightsTable(Airport.KRK));
    }
}

//TODO: Zabezpieczyć przed połączeniem z "X" do "X";
//TODO: Ustawić boolean: "WAW - LDN = true"  vs. "LDN - WAW =false"
//TODO: Zabezpieczyc przed podwójnymi połączeniami w timeTable
// TODO: do linii 16 -- always false
//        if (departure.equals(arrival)) {
//            System.out.println("Such a flight can't be achived");  // this is expected to prevent against inserting the same connection twice
//       do linii 46 -- //    public List<Flight> getFlightsFromTable (Airport departure) {
