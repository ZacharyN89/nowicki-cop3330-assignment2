/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class investmentCalculatorTest {

    @Test
    void catcher() {
        investmentCalculator TI84 = new investmentCalculator();
        assertTrue(TI84.catcher("99"));
    }

    @Test
    void catcher_0() {
        investmentCalculator TI84 = new investmentCalculator();
        assertFalse(TI84.catcher("0"));
    }

    @Test
    void catcher_letters() {
        investmentCalculator TI84 = new investmentCalculator();
        assertFalse(TI84.catcher("ABC"));
    }

    @Test
    void ruleOf72_set1() {
        investmentCalculator TI84 = new investmentCalculator();
        assertEquals(1.0,TI84.ruleOf72(72.0));
    }

    @Test
    void ruleOf72_set2() {
        investmentCalculator TI84 = new investmentCalculator();
        assertNotEquals(1.0, TI84.ruleOf72(73.0));
    }

    @Test
    void asker() {
    }
}