/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessingGameTest {

    @Test
    void check() {
        guessingGame test = new guessingGame();
        assertEquals(2,test.check("2"));
    }

    @Test
    void check_set2() {
        guessingGame test = new guessingGame();
        assertEquals(-1,test.check("hello"));
    }
}