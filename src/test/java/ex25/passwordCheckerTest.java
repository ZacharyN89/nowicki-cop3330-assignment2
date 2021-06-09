/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCheckerTest {

    @Test
    void printStrength() {


    }

    @Test
    void passwordValidator_just_numbers() {
        passwordChecker test = new passwordChecker();
        String check = "12345";
        int result = test.passwordValidator(check);

        assertEquals(1,result);

    }

    @Test
    void passwordValidator_just_letter() {
        passwordChecker test = new passwordChecker();
        String check = "abcde";
        int result = test.passwordValidator(check);

        assertEquals(2,result);

    }

    @Test
    void passwordValidator_numbers_and_letter() {
        passwordChecker test = new passwordChecker();
        String check = "12345ab";
        int result = test.passwordValidator(check);

        assertEquals(0,result);

    }

    @Test
    void passwordValidator_numbers_letters_8() {
        passwordChecker test = new passwordChecker();
        String check = "12345abcde";
        int result = test.passwordValidator(check);

        assertEquals(3,result);

    }

    @Test
    void passwordValidator_numbers_letters_schars_8() {
        passwordChecker test = new passwordChecker();
        String check = "12345abcde!";
        int result = test.passwordValidator(check);

        assertEquals(4,result);

    }
}