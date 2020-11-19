package com.mycompany.app.aufgabe3;

import static org.junit.Assert.assertEquals;

import com.mycompany.app.Aufgabe3.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void addition() {
        assertEquals(3, calc.addition(1, 2));
    }

    @Test
    public void negativeAddition() {
        assertEquals(1, calc.addition(-1, 2));
    }

    @Test
    public void subtraction() {
        assertEquals(-1, calc.subtraction(1, 2));
    }

    @Test
    public void ngeativeSubtraction() {
        assertEquals(1, calc.subtraction(-1, -2));
    }

    @Test
    public void multiplication() {
        assertEquals(2, calc.multiplication(1, 2));
    }

    @Test
    public void negativeMultiplication() {
        assertEquals(-2, calc.multiplication(1, -2));
    }

    @Test
    public void division() {
        assertEquals(2, calc.division(4, 2));
    }

    @Test
    public void negativeDivision() {
        assertEquals(-2, calc.division(-4, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDivision() {
        calc.division(2, 0);
    }

    @After
    public void teardown() {
        calc = null;
    }

}
