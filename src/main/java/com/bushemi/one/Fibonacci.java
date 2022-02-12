package com.bushemi.one;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static final Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    public int calculateNthNumber(int n) {
        if (n < 2) return n;
        return calculateNthNumber(n - 2) + calculateNthNumber(n - 1);
    }

    public int calculateNthNumberAdvanced(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, (calculateNthNumberAdvanced(n - 2) + calculateNthNumberAdvanced(n - 1)));
        }
        return memo.get(n);

    }


}
