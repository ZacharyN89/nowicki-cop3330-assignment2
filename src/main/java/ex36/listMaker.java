/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class listMaker {
    private static final Scanner in = new Scanner(System.in);
    public ArrayList<Double> makeList(){
        ArrayList<Double> numList = new ArrayList<Double>();
        String x;
        double y;
        String result = "Numbers: ";
        while(true){
            System.out.print("Enter a number: ");
            x = in.nextLine();

            //Check  if done.
            if(x.equals("done")){
                break;
            }

            //Check if valid input to add.
            try {
                y = Double.parseDouble(x);
                numList.add(y);
                result += y+", ";
            }
            catch(NumberFormatException e){
                //Do nothing. Loop again.
            }
        }
        System.out.println(result);
        return numList;
    }
}
