/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex26;

public class creditCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPayment){
        double dailyRate = APR/365;
        double result = -(1.0/30.0) * Math.log(1.0 + balance/monthlyPayment * (1.0 - Math.pow((1.0 + dailyRate),30.0))) / Math.log(1.0 + dailyRate);
        return Math.ceil(result);
    }
}
