package com.kodilla.paramertized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = {"/GamblingMachineTestGreenData.csv"}, delimiter = '.', numLinesToSkip = 0)

    public void shouldGetCorrectNumbers(String number) throws InvalidNumbersException {
        Set<Integer> numbers = Stream.of(number.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        gamblingMachine.howManyWins(numbers);
    }
    @ParameterizedTest
    @CsvFileSource(resources = {"/GamblingMachineTestData.csv"}, delimiter = '.', numLinesToSkip = 0)
    public void shouldNotGetWrongNumbers(String number) throws InvalidNumbersException {
        Set<Integer> numbers = Stream.of(number.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        try
        {
            gamblingMachine.howManyWins(numbers);

        }
        catch (InvalidNumbersException e)
        {
            System.out.println("For test purpose this exception is expected");
        }
    }
}