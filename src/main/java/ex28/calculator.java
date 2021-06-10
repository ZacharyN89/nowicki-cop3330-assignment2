/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex28;

import java.util.Scanner;

public class calculator {

    private static final Scanner in = new Scanner(System.in);

    public int loopCount(){
        int count = 0;
        for(int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            count += Integer.parseInt(in.next());
        }
        return count;
    }
}
