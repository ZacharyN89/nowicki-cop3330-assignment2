/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tableMakerTest {

    @Test
    void findSpecifier() {
        tableMaker Bob = new tableMaker();
        assertEquals(4,Bob.findSpecifier(12));
    }

    @Test
    void findSpecifier_false() {
        tableMaker Bob = new tableMaker();
        assertNotEquals(4,Bob.findSpecifier(3));
    }
}