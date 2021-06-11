/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class statisticsTest {

    @Test
    void average() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(100.0);
        nums.add(200.0);
        nums.add(300.0);
        nums.add(1000.0);

        statistics test = new statistics();
        assertEquals(400.0,test.average(nums));
    }

    @Test
    void max() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(100.0);
        nums.add(200.0);
        nums.add(300.0);
        nums.add(1000.0);

        statistics test = new statistics();
        assertEquals(100.0,test.min(nums));
    }

    @Test
    void min() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(100.0);
        nums.add(200.0);
        nums.add(300.0);
        nums.add(1000.0);

        statistics test = new statistics();
        assertEquals(1000.0,test.max(nums));
    }
}