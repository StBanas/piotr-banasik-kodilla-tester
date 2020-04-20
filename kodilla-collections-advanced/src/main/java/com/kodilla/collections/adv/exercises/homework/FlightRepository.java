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

    public void addFlight(String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
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

    repository.addFlight("KRK","LDN");
    repository.addFlight("KRK","WAW");
    repository.addFlight("WAW","LDN");
    repository.addFlight("WAW","KRK");
    repository.addFlight("LDN","WAW");
    repository.addFlight("LDN","KRK");

    repository.addConnection(Airport.KRK,flightList);
    repository.addConnection(Airport.WAW,flightList);

        System.out.println(flightList);
        System.out.println(flightTable);
    }
}
//TODO: checkUniqueness  - Zabezpieczyc przed podwójnymi połączeniami w flightTable
