package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;

public class Runner {

    public static void main (String[] args) {
//        Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
//        List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

        FlightRepository repository = new FlightRepository( getFlightTable()); //Airport.KRK,

        Flight LDN_WAW = new Flight("WAW", "LDN");
        Flight KRK_WAW = new Flight("WAW", "KRK");
        Flight WAW_LDN = new Flight("LDN", "WAW");
        Flight KRK_LDN = new Flight("LDN", "KRK");
        Flight WAW_KRK = new Flight("KRK", "WAW");
        Flight LDN_KRK = new Flight("KRK", "LDN");
//
//        WAW_LDN.addFlight("WAW", "LDN");
//        WAW_KRK.addFlight("WAW", "KRK");
//        LDN_WAW.addFlight("LDN", "WAW");
//        LDN_KRK.addFlight("LDN", "KRK");
//        KRK_LDN.addFlight("KRK", "LDN");
//        KRK_WAW.addFlight("KRK", "WAW");

        flightList.add(KRK_LDN);
        flightList.add(WAW_LDN);
        flightList.add(KRK_WAW);
        flightList.add(LDN_WAW);
        flightList.add(WAW_KRK);
        flightList.add(LDN_KRK);

        repository.addConnection(Airport.LDN,getFlightList());
        repository.addConnection(Airport.KRK,getFlightList());
        repository.addConnection(Airport.WAW,getFlightList());

        FlightFinder finder = new FlightFinder(getFlightTable());

        List<Flight> arrivals = finder.findFlightsFrom(getFlightTable(),"WAW");
//        List<Flight> arrivals1 = finder.findFlightsFrom(getFlightTable(),"LDN");
//        List<Flight> arrivals2 = finder.findFlightsFrom(getFlightTable(),"KRK");

        System.out.println(arrivals);
//        System.out.println(arrivals1);
//        System.out.println(arrivals2);
//        System.out.println(arrivals1);
//        System.out.println(arrivals2);
//        System.out.println(finder.findFlightsFrom(getFlightTable(), "WAW"));
//        System.out.println(getFlightTable());
//        System.out.println(getFlightList());
        List<Flight> departures = finder.findFlightsTo(getFlightTable(),"WAW");
        List<Flight> departures1 = finder.findFlightsTo(getFlightTable(),"LDN");
        List<Flight> departures2 = finder.findFlightsTo(getFlightTable(),"KRK");
        System.out.println("=======================================================");

        System.out.println(departures);
//        System.out.println(departures1);
//        System.out.println(departures2);

        }
}
