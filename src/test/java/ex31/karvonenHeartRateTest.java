/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class karvonenHeartRateTest {

    @Test
    void targetHeartRate() {
        karvonenHeartRate test = new karvonenHeartRate();
        test.setAge(22);
        test.setRestingHeartRate(65);
        assertEquals(138,(int) (Math.round(test.targetHeartRate(.55))));
    }

    @Test
    void targetHeartRate_set2() {
        karvonenHeartRate test = new karvonenHeartRate();
        test.setAge(22);
        test.setRestingHeartRate(65);
        assertEquals(145,(int) (Math.round(test.targetHeartRate(.60))));
    }

    @Test
    void targetHeartRate_set3() {
        karvonenHeartRate test = new karvonenHeartRate();
        test.setAge(22);
        test.setRestingHeartRate(65);
        assertEquals(151,(int) (Math.round(test.targetHeartRate(.65))));
    }
}