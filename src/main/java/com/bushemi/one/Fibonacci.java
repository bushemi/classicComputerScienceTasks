package com.bushemi.one;

public class Fibonacci {

    public int calculateNthNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calculateNthNumber(n - 2) + calculateNthNumber(n - 1);
    }
}
