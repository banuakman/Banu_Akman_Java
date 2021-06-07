package com.banuakman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoIntegersAndReturnTheResult() {
        int whatIShouldGet = 2;
        int whatIGot = calculator.add(1,1);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldSubtractTwoIntegersAndReturnTheResult() {
        int whatIShouldGet = 3;
        int whatIGot = calculator.subtract(5,2);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldMultiplyTwoIntegersAndReturnTheResult() {
        int whatIShouldGet = 15;
        int whatIGot = calculator.multiply(5,3);
        assertEquals(whatIShouldGet,whatIGot);
    }

    @Test
    public void shouldDivideTwoIntegersAndReturnTheResult() {
        int whatIShouldGet = 5;
        int whatIGot = calculator.divide(15,3);
        assertEquals(whatIShouldGet,whatIGot);
    }


    @Test
    public void shouldAddTwoDoublesAndReturnTheResult() {
        double whatIShouldGet = 2.2;
        double whatIGot = calculator.add(1.1,1.1);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldSubtractTwoDoublesAndReturnTheResult() {
        double whatIShouldGet = 3;
        double whatIGot = calculator.subtract(5,2);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldMultiplyTwoDoublesAndReturnTheResult() {
        double whatIShouldGet = 15;
        double whatIGot = calculator.multiply(5,3);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }

    @Test
    public void shouldDivideTwoDoublesAndReturnTheResult() {
        double whatIShouldGet = 5;
        double whatIGot = calculator.divide(15,3);
        assertEquals(whatIShouldGet,whatIGot, 0.01);
    }


}