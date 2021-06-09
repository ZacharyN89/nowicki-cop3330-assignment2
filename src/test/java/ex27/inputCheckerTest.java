/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputCheckerTest {

    @Test
    void checkFirstname() {
        inputChecker judge = new inputChecker();
        assertEquals("",judge.checkFirstname("Brian"));
    }

    @Test
    void checkFirstname_empty() {
        inputChecker judge = new inputChecker();
        assertEquals("The first name must be filled in.\n",judge.checkFirstname(""));
    }

    @Test
    void checkFirstname_less_than_2() {
        inputChecker judge = new inputChecker();
        assertEquals("\"A\" is not a valid first name. It is too short.\n",judge.checkFirstname("A"));
    }

    @Test
    void checkZip() {
        inputChecker judge = new inputChecker();
        assertEquals("",judge.checkZip("12345"));
    }

    @Test
    void checkZip_letters() {
        inputChecker judge = new inputChecker();
        assertEquals("The ZIP code must be numeric.\n",judge.checkZip("ABCDE"));
    }

    @Test
    void checkID() {
        inputChecker judge = new inputChecker();
        assertEquals("",judge.checkID("AA-1234"));
    }

    @Test
    void checkID_not_7() {
        inputChecker judge = new inputChecker();
        assertEquals("AA1234 is not a valid ID.",judge.checkID("AA1234"));
    }

    @Test
    void checkID_numbers() {
        inputChecker judge = new inputChecker();
        assertEquals("12-1234 is not a valid ID.",judge.checkID("12-1234"));
    }

    @Test
    void checkID_no_hyphen() {
        inputChecker judge = new inputChecker();
        assertEquals("AAA1234 is not a valid ID.",judge.checkID("AAA1234"));
    }
}