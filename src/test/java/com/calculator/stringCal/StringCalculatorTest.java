package com.calculator.stringCal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void testSingleNoSum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }
    @Test
    public void testTwoNoSum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"));
    }
    @Test
    public void testNewLineDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }
}
