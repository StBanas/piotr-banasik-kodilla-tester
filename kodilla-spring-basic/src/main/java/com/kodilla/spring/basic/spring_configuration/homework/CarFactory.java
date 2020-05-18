package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Car createCar() {
        Car car;
        Random generator = new Random();
        int seazon = generator.nextInt(4);

        if (seazon == 0 || seazon == 2) {
            car = new Sedan();
        } else if (seazon == 1) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }




}

