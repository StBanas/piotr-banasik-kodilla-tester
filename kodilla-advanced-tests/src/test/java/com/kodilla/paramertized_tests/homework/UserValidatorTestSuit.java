package com.kodilla.paramertized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuit {

    @ParameterizedTest
    @CsvSource(value = {"Jan Kowal", "jankowal", "_jan.Kowal_"}) //}

    public void shouldUsernamrMatchRegEx(String username) {
        UserValidator userValidator = new UserValidator();
        boolean  result = userValidator.validateUsername(username);
        assertTrue(result);

    }
    @ParameterizedTest
    @CsvSource(value = {"111111", "wel.blad@yahoo.com", "q@q.w"})
    public void shouldSmailMatchRegEx(String username) {
        UserValidator validateEmail = new UserValidator();
        boolean result1 = validateEmail.validateEmail(username) ;
        assertTrue(result1);

    }
}
