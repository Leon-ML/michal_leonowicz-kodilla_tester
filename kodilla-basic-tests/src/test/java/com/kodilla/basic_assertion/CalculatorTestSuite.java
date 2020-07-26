package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int a = 10;
        int b = 7;
        int subtractResult = calculator1.subtract(a, b);
        assertEquals(3, subtractResult);
    }
    @Test
    public void testSquare() {
        Calculator calculator2 = new Calculator();
        int a = 3;
        int squareResult = calculator2.square(a);
        assertEquals(9,squareResult);
    }

}

