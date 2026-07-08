package com.example.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        int result= calculator.add(5,3);
        System.out.println("ADDITION Result = " + result);
        assertEquals(8,result);
    }

    @Test
    public void testSubtract() {
        int result= calculator.subtract(5,3);
        System.out.println("SUBTRACTION Result = " + result);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result= calculator.multiply(5,3);
        System.out.println("MULTIPLY Result = " + result);
        assertEquals(15,result);
    }

    @Test
    public void testDivide() {
        int result= calculator.divide(5,3);
        System.out.println("DIVISION Result = " + result);
        assertEquals(1,result);
    }
}
