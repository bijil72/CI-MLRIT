package com.bijil;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testGenerateFibonacci_Zero() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> result = fibonacci.generateFibonacci(0);
        assertEquals(0, result.size(), "The Fibonacci series for n=0 should be empty.");
    }

    @Test
    public void testGenerateFibonacci_One() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> result = fibonacci.generateFibonacci(1);
        assertEquals(List.of(0), result, "The Fibonacci series for n=1 should be [0].");
    }

    @Test
    public void testGenerateFibonacci_Two() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> result = fibonacci.generateFibonacci(2);
        assertEquals(List.of(0, 1), result, "The Fibonacci series for n=2 should be [0, 1].");
    }

    @Test
    public void testGenerateFibonacci_Five() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> result = fibonacci.generateFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result, "The Fibonacci series for n=5 should be [0, 1, 1, 2, 3].");
    }
}
