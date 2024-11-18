package com.bijil;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int a = 0, b = 0, c = 1;

        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            fibonacciSeries.add(a);
        }

        return fibonacciSeries;
    }
}
