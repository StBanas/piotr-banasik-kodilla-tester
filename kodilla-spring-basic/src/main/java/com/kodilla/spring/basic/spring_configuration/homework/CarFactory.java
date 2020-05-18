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
        String[] seasons = {"Winter", "Summer", "Spring", "Autumn", "winter", "summer", "spring", "autumn"};
        Random r = new Random();
        int choice = r.nextInt(8);
        String season = seasons[choice];

        if (choice == 2 || choice == 3 || choice == 6 || choice == 7) {
            car = new Sedan();
        } else if (choice == 1 || choice == 5) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }
}

