package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {


    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }

        if (numbers.stream().anyMatch(number -> number < 1)) {
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while (numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

    public static void main(String[] args) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(3);
        userNumbers.add(2);
        userNumbers.add(1);
        userNumbers.add(45);
        userNumbers.add(12);
        userNumbers.add(5);
        int result = gamblingMachine.howManyWins(userNumbers);
        System.out.println(result);

    }
}


