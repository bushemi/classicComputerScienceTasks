package com.bushemi.one;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FibonacciService {

    private static final Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
    int lastFromStream = 0;
    int nextFromStream = 1;

    public int calculateNthNumber(int n) {
        if (n < 2) return n;
        return calculateNthNumber(n - 2) + calculateNthNumber(n - 1);
    }

    public int calculateNthNumberAdvanced(int n) {
        return memo.computeIfAbsent(n,
                key -> (calculateNthNumberAdvanced(n - 2) + calculateNthNumberAdvanced(n - 1)));
    }

    public int calculateNthNumberWithFor(int n) {
        int last = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int oldLast = last;
            last = next;
            next = last + oldLast;
        }
        return last;
    }

    public IntStream generatorStream() {
        return IntStream.generate(() -> {
            int oldLast = lastFromStream;
            lastFromStream = nextFromStream;
            nextFromStream = oldLast + lastFromStream;
            return oldLast;
        });
    }

    public int calculateNthNumberWithSingleRecursion(int n) {
        return fib(0, 1, n);
    }

    private int fib(int prev, int current, int n) {
        if (n == 0) {
            return prev;
        }
        n--;
        return fib(current, prev + current, n);
    }


}
