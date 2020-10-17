package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToValidate.csv", numLinesToSkip = 1)
    public void shouldNumberOfElementsSmallerThan6ThrowAnException(String input) throws InvalidNumbersException {
        assertThrows(InvalidNumbersException.class,()-> gamblingMachine.howManyWins(convertToSet(input)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToValidate.csv", numLinesToSkip = 1)
    public void shouldNumberOfElementsBiggerThan6ThrowAnException(Set<Integer> input, double expected) throws InvalidNumbersException {
        assertEquals(expected, gamblingMachine.howManyWins(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersToValidate.csv", numLinesToSkip = 1)
    public void isAnyOfElementsSmallerThan6(int number) {
        assertEquals(1, number, 0.1);
    }

    private Set<Integer> convertToSet(String input) {
        String[] strings = input.split(",");
        Set<Integer> doubles = Arrays.stream(strings).map(string -> Integer.parseInt(string)).collect(Collectors.toSet());
        return doubles;
    }
}