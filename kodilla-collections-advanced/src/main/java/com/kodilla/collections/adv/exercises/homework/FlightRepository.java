package com.kodilla.collections.adv.exercises.homework;
import java.util.*;

public class FlightRepository {
    Airport airport;

    public Map<Airport, List<Flight>> getConnections() {
        return connections;
    }

    Map<Airport, List<Flight>> connections;  //<Airport,List<Flight>>

    public FlightRepository(Airport airport, Map<Airport, List<Flight>> connections) {
        this.airport = airport;
        this.connections = connections;
    }

    public static Map<Airport, List<Flight>> getFlightTable() {
        return flightTable;
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }

    static Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
    static List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

    public void addConnection(Airport departure, List<Flight> flight) {
        List<Flight> flights = flightTable.getOrDefault(departure, Collections.emptyList());
        flightTable.put(departure, flight);
    }

    public void addFlight(String airport, String departure) {
        Flight flight = new Flight(departure, airport);
        flightList.add(flight);
    }

    public static void main(String[] args) {

        FlightRepository repository = new FlightRepository(Airport.WAW, flightTable);

    Flight flightLDN_WAW = new Flight("WAW", "LDN");
    Flight flightKRK_WAW = new Flight("WAW", "KRK");
    Flight flightWAW_LDN = new Flight("LDN", "WAW");
    Flight flightKRK_LDN = new Flight("LDN", "KRK");
    Flight flightLDN_WAW2 = new Flight("WAW", "LDN");
    Flight flightWAW_KRK = new Flight("KRK", "WAW");
    Flight flightLDN_KRK = new Flight("KRK", "LDN");
    Flight flightKRK_WAW2 = new Flight("WAW", "KRK");

    flightList.add(flightKRK_LDN);
    flightList.add(flightWAW_LDN);
    flightList.add(flightKRK_WAW);
    flightList.add(flightLDN_WAW);
    flightList.add(flightWAW_KRK);
    flightList.add(flightLDN_KRK);

    repository.addConnection(Airport.LDN,flightList);
    repository.addConnection(Airport.KRK,flightList);
    repository.addConnection(Airport.LDN,flightList);

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
