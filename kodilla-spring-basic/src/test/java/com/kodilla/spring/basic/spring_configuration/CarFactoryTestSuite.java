package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.Sedan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void testSedanCreated() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Sedan sedan = (Sedan) context.getBean("createSedan",Sedan.class);
        //when
        String car = sedan.getCarType();
        //then
        Assertions.assertEquals("Sedan", car);
    }
    @Test
    public void shouldSedanHasLightsTurnedOn() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Sedan sedan = context.getBean("createSedan", Sedan.class);
        //when
        String car = sedan.getCarType();
        boolean lights = sedan.hasHeadlightsTurnedOn(LocalTime.of (13,00));
        //then
        Assertions.assertFalse(lights);
    }

    @Test
    public void ShouldHasRandomCarBeenCreated() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean("createCar", Car.class);
        //when
        String carType = car.getCarType();
        //then
        List<String> possibleCars = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCars.contains(carType));
    }
    @Test
    public void shouldRandomCarHasLightsOn () {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean("createCar",Car.class);
        //when
        String carType = car.getCarType();
        boolean lights = car.hasHeadlightsTurnedOn(LocalTime.of(8,00));
        //then
        Assertions.assertFalse(lights);
    }
}
