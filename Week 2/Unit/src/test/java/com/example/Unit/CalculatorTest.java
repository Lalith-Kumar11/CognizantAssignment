package com.example.Unit;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

// Simple class to test
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {

    private Calculator calculator;

    // Setup method (runs before each test)
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    // Teardown method (runs after each test)
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed.");
    }

    // Test using Arrange-Act-Assert (AAA) pattern
    @Test
    public void testAddition() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        // Arrange
        int a = -1;
        int b = -2;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(-3, result);
    }
}
