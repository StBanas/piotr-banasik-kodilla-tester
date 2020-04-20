package com.kodilla.collections.adv.exercises.homework;
import java.util.*;

public class FlightRepository {
//    Airport airport;
    Map<Airport, List<Flight>> connections;

    public FlightRepository( Map<Airport, List<Flight>> connections) {     //Airport airport,
//        this.airport = airport;
        this.connections = connections;
    }

    public static Map<Airport, List<Flight>> getFlightTable() { return flightTable;}

    public static List<Flight> getFlightList() { return flightList; }

    static Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
    static List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

    public void addConnection(Airport departure, List<Flight> flight) {
        List<Flight> flights = flightTable.getOrDefault(departure, Collections.emptyList());
        flightTable.put(departure, flight);
    }

    public void addFlight(String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
        flightList.add(flight);
    }

    public static void main(String[] args) {

        FlightRepository repository = new FlightRepository( getFlightTable()); //Airport.WAW,

    Flight LDN_WAW = new Flight("WAW", "LDN");
    Flight KRK_WAW = new Flight("WAW", "KRK");
    Flight WAW_LDN = new Flight("LDN", "WAW");
    Flight KRK_LDN = new Flight("LDN", "KRK");
    Flight WAW_KRK = new Flight("KRK", "WAW");
    Flight LDN_KRK = new Flight("KRK", "LDN");

//    WAW_LDN.addFlight("WAW", "LDN");
//    WAW_KRK.addFlight("WAW", "KRK");
//    LDN_WAW.addFlight("LDN", "WAW");
//    LDN_KRK.addFlight("LDN", "KRK");
//    KRK_LDN.addFlight("KRK", "LDN");
//    KRK_WAW.addFlight("KRK", "WAW");

    flightList.add(KRK_LDN);
    flightList.add(WAW_LDN);
    flightList.add(KRK_WAW);
    flightList.add(LDN_WAW);
    flightList.add(WAW_KRK);
    flightList.add(LDN_KRK);

    repository.addConnection(Airport.LDN,getFlightList());
    repository.addConnection(Airport.KRK,getFlightList());
    repository.addConnection(Airport.WAW,getFlightList());

        System.out.println(getFlightList());
        System.out.println(getFlightTable());

    }
}



//TODO: Zabezpieczyć przed połączeniem z "X" do "X";
//TODO: Ustawić boolean: "WAW - LDN = true"  vs. "LDN - WAW =false"
//TODO: Zabezpieczyc przed podwójnymi połączeniami w timeTable
// TODO: do linii 16 -- always false
//        if (departure.equals(arrival)) {
//            System.out.println("Such a flight can't be achived");  // this is expected to prevent against inserting the same connection twice
//       do linii 46 -- //    public List<Flight> getFlightsFromTable (Airport departure) {
