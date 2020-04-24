package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {

    public String arrival;
    public String departure;

    public Flight( String arrival, String departure) {      //, String arrival

        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
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

    @Override
    public String toString() {
        return "Flight{" +
                "arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
