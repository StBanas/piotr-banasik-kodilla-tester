package com.kodilla.paramertized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuit {

    @ParameterizedTest
    @CsvSource(value = {"JanKowal", "jankowal", "_jan.Kowal_"}) //}

    public void shouldUsernamrMatchRegEx(String username) {
        UserValidator userValidator = new UserValidator();
        boolean  result = userValidator.validateUsername(username);
        assertTrue(result);

    }
    @ParameterizedTest
    @CsvSource(value = {"Jan Kowal", "~jankowal", "=jan.Kowal="}) //}

    public void shouldNotUsernamrMatchRegEx(String username) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"111111", "more.wel.blad@ya@oo.com", "qq.walter&yahoo.com"})
    public void shouldNotEmailMatchRegEx(String username) {
        UserValidator validateEmail = new UserValidator();
        boolean result1 = validateEmail.validateEmail(username) ;
        assertFalse(result1);

    }
    @ParameterizedTest
    @CsvSource(value = {"12.11@11.com", "wel.blad@yahoo.com", "q@q.w"})
    public void shouldEmailMatchRegEx(String username) {
        UserValidator validateEmail = new UserValidator();
        boolean result1 = validateEmail.validateEmail(username) ;
        assertTrue(result1);

    }
}
