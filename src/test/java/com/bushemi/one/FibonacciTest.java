package com.bushemi.one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class FibonacciTest {
    Fibonacci service = new Fibonacci();

    @DataProvider
    public Object[][] numbersForFibonacci() {
        return new Object[][]{
                new Object[]{0, 0},
                new Object[]{1, 1},
                new Object[]{2, 1},
                new Object[]{3, 2},
                new Object[]{4, 3},
                new Object[]{5, 5},
                new Object[]{6, 8},
                new Object[]{7, 13},
                new Object[]{8, 21},
                new Object[]{9, 34}
        };
    }

    @Test(dataProvider = "numbersForFibonacci")
    public void should_calculate_n_numbers(int n, int expectedFibo) {
        //given
        //when
        int fibo = service.calculateNthNumber(n); //0,1,1,2,3,5,8

        //then
        assertThat(fibo, is(equalTo(expectedFibo)));
    }

    @Test(dataProvider = "numbersForFibonacci")
    public void should_calculate_n_numbers_advanced(int n, int expectedFibo) {
        //given
        //when
        int fibo = service.calculateNthNumberAdvanced(n); //0,1,1,2,3,5,8

        //then
        assertThat(fibo, is(equalTo(expectedFibo)));
    }
}
