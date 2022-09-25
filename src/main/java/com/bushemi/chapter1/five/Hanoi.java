package com.bushemi.chapter1.five;

import java.util.Deque;
import java.util.LinkedList;

public class Hanoi {
    public final Deque<Integer> towerA = new LinkedList<>();
    public final Deque<Integer> towerB = new LinkedList<>();
    public final Deque<Integer> towerC = new LinkedList<>();
    private final int numDiscs;

    public Hanoi(int discs) {
        numDiscs = discs;
        for (int i = 1; i <= discs; i++) {
            towerA.add(i);
        }
    }

    private void move(Deque<Integer> begin, Deque<Integer> end, Deque<Integer> temp, int n) {
        if (n == 1) {
            end.push(begin.pop());
        } else {
            move(begin, temp, end, n - 1);
            move(begin, end, temp, 1);
            move(temp, end, begin, n - 1);
        }
    }

    public void solve() {
        move(towerA, towerC, towerB, numDiscs);
    }
}
