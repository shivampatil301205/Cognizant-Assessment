package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
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
    public void testAdd() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testAssertions() {
        assertEquals(50, calculator.multiply(10, 5));
        assertTrue(calculator.add(5, 5) > 0);
        assertFalse(calculator.subtract(5, 5) > 0);
        assertNull(null);
        assertNotNull(calculator);
    }
}

