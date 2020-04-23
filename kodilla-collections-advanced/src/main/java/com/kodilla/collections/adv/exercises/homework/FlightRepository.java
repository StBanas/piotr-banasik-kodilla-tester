package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    Airport airport;
    Map<Airport, List<Flight>> connections;

    public FlightRepository(Airport airport, Map<Airport, List<Flight>> connections) {
        this.airport = airport;
        this.connections = connections;
    }

    static Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
    static List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

    public void addConnection(Airport departure, List<Flight> flight) {
        List<Flight> flights = flightTable.getOrDefault(departure, Collections.emptyList());
        flightTable.put(departure, flight);
    }

    public void addFlight(Airport airport, String arrival, String departure) {
        Flight flight = new Flight(airport,arrival, departure);
//        checkUniqueness(flight);
        checkCorrectness(flight);
        flightList.add(flight);
    }

//    private void checkUniqueness(Flight flight) {
//        for (Flight fly : flightList)
//            if (fly.getDeparture().equals(flight.getDeparture()) && fly.getArrival().equals(flight.getArrival())) {
//                System.out.println("This flight : " + flight + " is already on the list.");
//                break;
//            }
//        flightList.add(flight);
//    }
    private void checkCorrectness(Flight flight) {
        for (Flight fly : flightList) {
            if (flight.getDeparture().equals(flight.getArrival()))  {
            System.out.println("This flight : " + flight + " is not available.");
                break;
            }
        }
    }

    public static void main(String[] args) {
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

        System.out.println(flightList);
        System.out.println(flightTable);
    }
}
//TODO: checkUniqueness  - Zabezpieczyc przed podwójnymi połączeniami w flightTable
