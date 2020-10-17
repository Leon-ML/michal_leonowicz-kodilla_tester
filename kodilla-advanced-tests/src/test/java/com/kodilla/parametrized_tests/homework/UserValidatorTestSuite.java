package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"pablo99@costam.com", "janusz123@vp.pl", "jbzd@interia.pl"})
    public void shouldReturnTrueForEmailValidation(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"pablo99@costam..co", "janusz123_vp.pl", "jbz1412nteria.pl", "r132fdaw_!_$!M$``"})
    public void shouldReturnFalseForEmailValidation(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}