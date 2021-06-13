/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class databaseTest {

    @Test
    void orderByLastName() {
        database test = new database();
        test.makeDatabase();
        String[] check = {""}
        assertEquals("",test.printByLastName());
    }
}