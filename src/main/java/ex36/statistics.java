/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex36;

import java.util.ArrayList;

public class statistics {
    public void printStats(ArrayList<Double> list){
        String average = String.format("%.2f",average(list));
        String std = String.format("%.2f",std(list));
        String result = "";
        result += "The average is "+average+"\n";
        result += "The minimum is "+min(list)+"\n";
        result += "The maximum is "+max(list)+"\n";
        result += "The Standard deviation is "+std+"\n";
        System.out.print(result);
    }
    public double average(ArrayList<Double> list){
        double total = 0;
        for(int i=0; i<list.size();i++){
            total += list.get(i);
        }
        return total/list.size();
    }
    public double max(ArrayList<Double> list){
        double max = Double.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
    public double min(ArrayList<Double> list){
        double min = Double.MAX_VALUE;
        for(int i=0; i<list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public double std(ArrayList<Double> list){
        double average = average(list);
        double total = 0;
        double x;
        for(int i=0; i<list.size();i++){
            x = list.get(i);
            x -= average;
            x = Math.pow(x,2);
            total += x;
        }
        double result = total/list.size();
        return Math.pow(result, 0.5);
    }
}
