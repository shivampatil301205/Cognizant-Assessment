package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AaaCalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void add_whenOperandsArePositive_returnsSum() {
        int a = 20;
        int b = 22;

        int result = calculator.add(a, b);

        assertNotNull(calculator);
        assertEquals(42, result);
        assertTrue(result > 0);
    }

    @Test
    public void subtract_whenSecondIsLarger_returnsNegative() {
        int a = 10;
        int b = 25;

        int result = calculator.subtract(a, b);

        assertEquals(-15, result);
        assertTrue(result < 0);
    }

    @Test
    public void calculateAverage_whenListHasValues_returnsExpectedAverage() {
        int[] values = new int[] { 2, 4, 6, 8 };

        Double average = calculator.average(values);

        assertNotNull(average);
        assertEquals(5.0, average.doubleValue(), 0.0001);
    }

    @Test
    public void calculateAverage_whenListIsNull_returnsNull() {
        int[] values = null;

        Double average = calculator.average(values);

        assertNull(average);
    }

    private static class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int subtract(int a, int b) {
            return a - b;
        }

        Double average(int[] values) {
            if (values == null || values.length == 0) {
                return null;
            }

            int sum = 0;
            for (int v : values) {
                sum += v;
            }
            return sum / (double) values.length;
        }
    }
}

