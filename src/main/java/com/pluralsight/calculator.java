package com.pluralsight;

public class calculator {
    public static void main(String[] args) {
        double P = 43000;
        double yearlyRate = 0.053;
        double i = yearlyRate / 12; // monthly interest rate
        int n = 10 * 12; // total months multiply by years
        double numerator = i * Math.pow(1 + i, n);
        double denominator = Math.pow(1 + i, n) - 1;
    }
}
