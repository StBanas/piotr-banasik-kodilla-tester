package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.*;

public class Runner {

    public static void main (String[] args) {
        Map<Airport, List<Flight>> flightTable = new HashMap<>();  // k: Airport wylotu , v: port wylotu-port docelowy,
        List<Flight> flightList = new ArrayList<>();  // k: port wylotu , v: port docelowy,

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

        FlightFinder finder = new FlightFinder(getFlightTable());

        List<Flight> arrivals = finder.findFlightsFrom(getFlightTable(),"LDN");

        System.out.println(arrivals);
//        System.out.println(finder.findFlightsFrom(getFlightTable(), "WAW"));
//        System.out.println(getFlightTable());

        }
}
