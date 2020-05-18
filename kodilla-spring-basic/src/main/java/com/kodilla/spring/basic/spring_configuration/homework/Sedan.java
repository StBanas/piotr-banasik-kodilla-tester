package com.kodilla.spring.basic.spring_configuration.homework;
import java.time.LocalTime;

public class Sedan implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime hour = LocalTime.now();

        if (hour.isAfter(LocalTime.of(20, 00)) || (hour.isBefore(LocalTime.of(6, 00)))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
