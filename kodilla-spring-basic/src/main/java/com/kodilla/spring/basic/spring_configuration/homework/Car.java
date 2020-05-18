package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

//    public abstract boolean hasHeadlightsTurnedOn ();
//
    boolean hasHeadlightsTurnedOn(LocalTime hour);

    public String getCarType();

}
