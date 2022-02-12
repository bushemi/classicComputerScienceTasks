package com.bushemi.one;

public class Fibonacci {

    public int calculateNthNumber(int n) {
        if (n < 2) return n;
        return calculateNthNumber(n - 2) + calculateNthNumber(n - 1);
    }
}
