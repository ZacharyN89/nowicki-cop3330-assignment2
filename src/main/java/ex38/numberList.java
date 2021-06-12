/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numberList {
    private static final Scanner in = new Scanner(System.in);
    public List<String> makeList(){
        //ArrayList<Integer> result = new ArrayList<Integer>();

        //Get the numbers.
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String list = in.nextLine();

        //Convert from a string to a string array, and then a string arraylist.
        String[] hold = list.split(" ");
        List<String> result = new ArrayList<String>();
        result = Arrays.asList(hold);

        return result;
    }

    public ArrayList<Integer> convertList(List<String> list){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String s : list) result.add(Integer.valueOf(s));
        return result;
    }

    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            if((list.get(i) % 2) != 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public void printList(ArrayList<Integer> list){
        System.out.print("The even numbers are "+list.toString());
    }

}
