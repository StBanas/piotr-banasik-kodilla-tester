package com.kodilla.collections.adv.exercises.homework;
import java.util.*;

public class FlightRepository {
    Airport airport;               // seems not to be neccesary when TODO5 is absent
    Map<Airport, List<Flight>> connections;

    public FlightRepository( Airport airport,Map<Airport, List<Flight>> connections) {     //
        this.airport = airport;                // seems not to be neccesary
        this.connections = connections;
    }

    static Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
    static List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

    public static void addConnection(Airport departure, List<Flight> flight) {
        List<Flight> flights = flightTable.getOrDefault(departure, Collections.emptyList());
//                                                           if () {} // TODO: 5.  wyłączyć z Airport.X loty, które go nie dotyczą
        flightTable.put(departure, flight);
    }

    public static void addFlight(String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
        flightList.add(flight);
    }
    public void checkUniqueness(){

    }

    public static void main(String[] args) {

    FlightRepository.addFlight("KRK","LDN");
    FlightRepository.addFlight("KRK","WAW");
    FlightRepository.addFlight("WAW","LDN");
    FlightRepository.addFlight("WAW","LDN");
    FlightRepository.addFlight("LDN","WAW");
    FlightRepository.addFlight("LDN","KRK");

    FlightRepository.addConnection(Airport.LDN,flightList);
    FlightRepository.addConnection(Airport.KRK,flightList);
    FlightRepository.addConnection(Airport.WAW,flightList);

        System.out.println(flightList);
        System.out.println(flightTable);
    }
}

//TODO: Zabezpieczyć przed połączeniem z "X" do "X";
//TODO: Ustawić boolean: "WAW - LDN = true"  vs. "LDN - WAW =false"
//TODO: Zabezpieczyc przed podwójnymi połączeniami w timeTable
// TODO: do linii 16 -- always false
//        if (departure.equals(arrival)) {
//            System.out.println("Such a flight can't be achived");  // this is expected to prevent against inserting the same connection twice
//       do linii 46 -- //    public List<Flight> getFlightsFromTable (Airport departure) {
