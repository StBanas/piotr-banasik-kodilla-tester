package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    List<Flight> flights;

    public FlightRepository( List<Flight> flights) {

        this.flights = flights;
    }
    public static List<Flight> flightList = new ArrayList<>();

    public void addFlights(List<Flight> list, String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
        checkCorrectness(flight);   ///list,
//        checkUniqueness(flight);
    }

    private void checkCorrectness(Flight flight) {  //List<Flight> flightList,
        for (Flight fly : flightList){
            if (flight.getDeparture().equals(flight.getArrival())) { /// && fly.getArrival().equals(flight.getArrival())
                System.out.println("This flight from " + flight.getDeparture() + " to " + flight.getArrival() + " is not available.");
                break;
            }
        } checkUniqueness(flight);

        flightList.add(flight);
    }

    private void checkUniqueness(Flight flight) {
        for (Flight fly : flightList) {
            if (fly.getDeparture().equals(flight.getDeparture()) && fly.getArrival().equals(flight.getArrival())) {
                System.out.println("This flight : " + flight + " is already on the list.");
                break;
            }
        }
//        flightList.add(flight);
   }

    public static void main(String[] args) {

        FlightRepository repository = new FlightRepository(flightList);

    flightList.add(new Flight("KRK", "LDN"));
    flightList.add(new Flight("KRK", "WAW"));
    flightList.add(new Flight("WAW", "LDN"));
    flightList.add(new Flight( "WAW", "KRK"));
    flightList.add(new Flight("LDN", "KRK"));
    flightList.add(new Flight( "LDN", "WAW"));

    }
}
//TODO: checkUniqueness  - Zabezpieczyc przed podwójnymi połączeniami
