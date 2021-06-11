/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex33;

import java.util.Scanner;

public class magicBall {
    private String[] response = {"Yes,","No,","Maybe,","Ask again later."};

    private static final Scanner in = new Scanner(System.in);

    public String ask(){
        System.out.print("What's your question? ");
        String question = in.next();
        return (pick());
    }

    public String pick(){
        return response[(int) (Math.random() * 4)];
    }
}
