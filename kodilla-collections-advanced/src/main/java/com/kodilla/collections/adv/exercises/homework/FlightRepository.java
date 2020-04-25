package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    List<Flight> flights;

    public FlightRepository( List<Flight> flights) {

        this.flights = flights;
    }
    public static List<Flight> flightList = new ArrayList<>();

    public void addFlights(String arrival, String departure) {
        Flight flight = new Flight(arrival, departure);
        checkUniqueness(flight);
//        flightList.add(flight);
        }

    private void checkUniqueness(Flight flight) {
        if (!(flight.getDeparture().equals(flight.getArrival()))) {

            for (Flight fly : flightList)
                if ((fly.getDeparture().equals(flight.getDeparture()) && fly.getArrival().equals(flight.getArrival()))) {
                    System.out.println("This flight : " + flight + " is already on the list.");
                    break;
                }
            else
                break;
            {

                flightList.add(flight);
            }
        }
        else
            System.out.println("This flight from " + flight.getDeparture() + " to " + flight.getArrival() + " is not available.");
//        System.out.println("jestem z IV poziomu   - informuję o flight-cie  z A do A ");break;
    }

    public static void main(String[] args) {

        FlightRepository repository = new FlightRepository(flightList);

//        repository.addFlights("KRK", "LDN");
//        repository.addFlights("KRK", "WAW");
//        repository.addFlights("WAW", "LDN");
//        repository.addFlights("WAW", "KRK");
//        repository.addFlights("LDN", "KRK");
//        repository.addFlights("LDN", "WAW");
    }
}
//TODO: checkUniqueness  - Zabezpieczyc przed podwójnymi połączeniami
