package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.Airport;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

public class Flight  {
    public String arrival;
    public String departure;

    public Flight(String arrival, String departure) {      //, String arrival
        this.arrival= arrival;
        this.departure = departure;
    }
    public String getArrival() {
        return arrival;
    }

    static List<Flight> flightList = new ArrayList<>();

    public void addFlight(String airport, String departure) {
        Flight flight = new Flight(departure, airport);
        flightList.add(flight);
    }
    public String getDeparture() {
        return departure;
    }

    @Override
    public String toString() {
        return " Airport: " +
                " " + departure +
                ", departure to = " + arrival + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrival, flight.arrival) &&
                Objects.equals(departure, flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departure);
    }
}