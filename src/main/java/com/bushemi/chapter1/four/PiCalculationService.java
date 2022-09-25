package com.bushemi.chapter1.four;

public class PiCalculationService {
    //the more precision, the better number will be calculated.
    public double calculatePi(int precision) {
        final double numerator = 4.0;
        double denominator = 1.0;
        double operation = 1.0;
        double pi = 0.0;
        for (int i = 0; i < precision; i++) {
            pi += operation * (numerator / denominator);
            denominator += 2;
            operation *= -1.0;
        }
        return pi;
    }
}
