/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex29;

import java.util.Scanner;

public class investmentCalculator {
    private static final Scanner in = new Scanner(System.in);

    public boolean catcher(String test){
        double result;

        try{
            result = Double.parseDouble(test);

            if(result == 0){
                System.out.println("Sorry. That's not a valid input.");
                return false;
            }

            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }
    }

    public double ruleOf72(double rate){
        return 72/rate;
    }

    public double asker(){
        double rate = 0;

        while(rate == 0) {
            System.out.print("What is the rate of return? ");
            String test = in.next();

            if(catcher(test)){
                rate = Double.parseDouble(test);
            }
        }

        return rate;
    }
}
