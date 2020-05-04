package com.kodilla.paramertized_tests.homework;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMIDataSuplier {

        static Stream<Arguments> provideDataForTestingBMI() {
            return
            Stream.of(
                    Arguments.of( 1.85, 95, "Overweight"),
                    Arguments.of( 1.85, 78,"Normal (healthy weight)"),
                    Arguments.of( 1.85,61, "Underweight" ),
                    Arguments.of( -1, 0, "Very severely underweight"));

                        }
    }

