package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    public Airport airport;
    public String arrival;
    public String departure;

    public Flight(Airport airport, String arrival, String departure) {      //, String arrival
        this.airport = airport;
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public Airport getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return airport == flight.airport &&
                Objects.equals(arrival, flight.arrival) &&
                Objects.equals(departure, flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport, arrival, departure);
    }
}
