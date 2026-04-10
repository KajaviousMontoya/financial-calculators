package com.pluralsight;

public class calculator {
    public static void main(String[] args) {
        double P = 43000;
        double yearlyRate = 0.053 / 12;
        double i = yearlyRate / 12; // monthly interest rate
        int n = 10 * 12; // total months multiply by years
        double numerator = i * Math.pow(1 + i, n);
        double denominator = Math.pow(1 + i, n) - 1;
        double M = P * (numerator / denominator);
        System.out.printf("Monthly Payment: %.2f\n", M); // start of format, the decimal places, and f for float

    }
}
