/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class creditCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_set1() {
        creditCalculator calc = new creditCalculator();
        double result = calc.calculateMonthsUntilPaidOff(5000,.12,100);

        assertEquals(70,result);
    }

    @Test
    void calculateMonthsUntilPaidOff_set2() {
        creditCalculator calc = new creditCalculator();
        double result = calc.calculateMonthsUntilPaidOff(6000,.15,500);

        assertEquals(14,result);
    }
}