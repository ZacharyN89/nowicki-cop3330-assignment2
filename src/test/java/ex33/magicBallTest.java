package ex33;
/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class magicBallTest {
    //Only 1 test should work at a time since it randomly chooses values.
    @Test
    void pick_1() {
        magicBall test = new magicBall();
        assertEquals("Yes,",test.pick());
    }

    @Test
    void pick_2() {
        magicBall test = new magicBall();
        assertEquals("No,",test.pick());
    }

    @Test
    void pick_3() {
        magicBall test = new magicBall();
        assertEquals("Maybe,",test.pick());
    }

    @Test
    void pick_4() {
        magicBall test = new magicBall();
        assertEquals("Ask again later.",test.pick());
    }
}