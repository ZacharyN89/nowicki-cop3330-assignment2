/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex31;

import java.util.Scanner;

public class karvonenHeartRate {

    private static final Scanner in = new Scanner(System.in);
    private double age;
    private double restingHeartRate;

    public void asker(){
        System.out.print("What is your age? ");
        age = check();
        System.out.print("What is your resting heart rate? ");
        restingHeartRate = check();
    }

    public double targetHeartRate(double intensity){
        return (((220 - age) - restingHeartRate) * intensity) + restingHeartRate;
    }

    public void makeTable(){
        System.out.println("Resting Pulse: "+restingHeartRate+"      Age: "+age+"\nIntensity| Rate\n---------|-------");
        for(double i = 0.55; i<1.0; i+=0.05){
            int percentage = (int) (i*100);
            int bpm = (int) Math.round(targetHeartRate(i));
            System.out.println(percentage+"%      | "+bpm+" bpm");
        }
    }

    public double check(){
        while(true) {
            try {
                return Double.parseDouble(in.next());
            } catch (NumberFormatException e) {
                System.out.print("The input must be numeric. Please enter a number now.\n");
            }
        }
    }

    public void setAge(int x){
        age = x;
    }

    public void setRestingHeartRate(int x){
        restingHeartRate = x;
    }
}
