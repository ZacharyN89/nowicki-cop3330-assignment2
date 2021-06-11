/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class winnerPicker {
    private static final Scanner in = new Scanner(System.in);

    public ArrayList<String> makeList(){
        ArrayList<String> contestants = new ArrayList<String>();
        String x;
        while(true){
            System.out.print("Enter a name: ");
            x = in.nextLine();
            if(x.isEmpty()){
                break;
            }
            contestants.add(x);
        }
        return contestants;
    }

    public String selectWinner(ArrayList<String> list){
        int index = (int) (Math.random()*list.size());
        return list.get(index);
    }
}
