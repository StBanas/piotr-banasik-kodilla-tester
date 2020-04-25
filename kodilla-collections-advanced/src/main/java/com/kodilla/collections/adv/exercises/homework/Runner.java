package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.flightList;

public class Runner {

    public static void main(String[] args) {

        FlightRepository repository0 = new FlightRepository(flightList);
        repository0.addFlights("WAW", "LDN");
        System.out.println(flightList);
        System.out.println("=================================================");

        repository0.addFlights("WAW", "WAW");

        repository0.addFlights("WAW", "LDN");
        repository0.addFlights("WAW", "KRK");
        System.out.println(flightList);
    }
}

