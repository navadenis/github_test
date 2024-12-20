package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator(2, 6);
        int result = calculator.sum();
        assertEquals(8, result, "Sum of 3 and 5 should be 8");
    }

    @Test
    void exp() {
        Calculator calculator = new Calculator(2, 4);
        int result = calculator.exp();
        assertEquals(16, result, "2 raised to the power of 3 should be 8");
    }
}