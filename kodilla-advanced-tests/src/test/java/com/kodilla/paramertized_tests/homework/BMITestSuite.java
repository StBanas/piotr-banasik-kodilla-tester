package com.kodilla.paramertized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BMITestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.paramertized_tests.homework.BMIDataSuplier#provideDataForTestingBMI")
    public void shouldCalculateBMIwithCorrectData(String input) {
        System.out.println(input);
    }
}