/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeListTest {

    @Test
    void arraySize() {
        employeeList workers = new employeeList();
        workers.makeList();
        assertEquals(5,workers.arraySize());
    }

    @Test
    void maybe() {
        employeeList workers = new employeeList();
        workers.makeList();
        assertEquals(1,workers.maybe());
    }
}