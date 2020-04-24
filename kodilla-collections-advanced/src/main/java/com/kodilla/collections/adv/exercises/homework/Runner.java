package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.flightList;

public class Runner {

    public static void main(String[] args) {

//        List<Flight> flightList = new ArrayList<>();

        FlightRepository repository0 = new FlightRepository(flightList);

        repository0.addFlights( flightList,"WAW", "LDN");
        flightList.add(new Flight("LDN", "WAW"));
        repository0.addFlights(flightList,"WAW", "LDN");
        repository0.addFlights(flightList,"WAW", "WAW");


        System.out.println("=================================================");
        System.out.println(flightList);
        System.out.println("=================================================");

        FlightFinder finder = new FlightFinder(flightList);
        finder.findFlightsFrom("WAW");
        List<Flight> arrivals = finder.findFlightsFrom("WAW");
        System.out.println(arrivals.size());
    }



}

