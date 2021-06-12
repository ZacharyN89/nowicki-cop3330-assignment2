/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class numberListTest {

    @Test
    void convertList() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        numberList test = new numberList();
        ArrayList<Integer> answer = test.convertList(list);
        assertEquals(1,answer.get(0));
    }

    @Test
    void filterEvenNumbers() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        numberList test = new numberList();
        ArrayList<Integer> answer = test.convertList(list);
        test.filterEvenNumbers(answer);
        assertEquals(2,answer.get(0));
    }
}