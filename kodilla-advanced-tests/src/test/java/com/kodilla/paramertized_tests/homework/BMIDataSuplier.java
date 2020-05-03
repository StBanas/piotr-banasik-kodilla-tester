package com.kodilla.paramertized_tests.homework;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMIDataSuplier {

        static Stream<Arguments> provideDataForTestingBMI() {
            return
            Stream.of(
                    Arguments.of( new Person(1.85, 95).getBMI() ),
                    Arguments.of( new Person(1.85, 78).getBMI() ),
                    Arguments.of( new Person(1.85, 61).getBMI() ),
                    Arguments.of( new Person(-1, 0).getBMI()));

                        }
    }

