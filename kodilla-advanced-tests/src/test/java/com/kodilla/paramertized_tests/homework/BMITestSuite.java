package com.kodilla.paramertized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.paramertized_tests.homework.BMIDataSuplier#provideDataForTestingBMI")
    public void shouldCalculateBMIwithCorrectData(double height, double weight, String expected ) {

       //given
            Person person = new Person(height, weight);

        //when
            String BMIResult = person.getBMI();

        //then
            assertEquals(BMIResult,expected);
        }
    }
