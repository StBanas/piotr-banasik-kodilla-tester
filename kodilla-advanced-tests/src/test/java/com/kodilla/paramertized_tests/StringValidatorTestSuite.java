package com.kodilla.paramertized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

//    @Test
//    public void shouldReturnFalseIfStringIsNotEmpty() {
//        assertFalse(validator.isBlank("test"));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsEmpty() {
//        assertTrue(validator.isBlank(""));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringHasOnlySpaces() {
//        assertTrue(validator.isBlank("   "));
//    }
//
//    @Test
//    public void shouldReturnTrueIfStringIsNull() {
//        assertTrue(validator.isBlank(null));
//    }
    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }
}
