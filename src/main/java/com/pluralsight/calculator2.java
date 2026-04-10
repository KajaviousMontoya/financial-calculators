package com.pluralsight;

public class calculator2 {
    public static void main(String[] args) {
        double P = 4000; // chose 4,000 invested into a stock
        double r = 0.0135; // 1.35% interest rate
        int t = 2; // amount of years for future value
        double FV = P * Math.pow(1 + (r / 365), 365 * t);
        System.out.printf("Future Value: %.2f\n", FV);
    }
}
