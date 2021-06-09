/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Nowicki
 */
package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramDetector {

    private static final Scanner in = new Scanner(System.in);

    public void isAnagram(){
        String first;
        String second;
        do {
            System.out.print("Enter the first string: ");
            first = in.next();

            System.out.print("Enter the second string: ");
            second = in.next();
        }while(!checkLength(first,second));

        checkAnagram(first, second);
    }

    private void checkAnagram(String first, String second) {
        String result;

        char[] one = first.toCharArray();
        Arrays.sort(one);

        char[] two = second.toCharArray();
        Arrays.sort(two);

        if(Arrays.equals(one,two)){
            result = "\""+first+"\" and \""+second+"\" are anagrams.";
        }else{
            result = "\""+first+"\" and \""+second+"\" are not anagrams.";
        }

        System.out.print(result);
    }

    public static boolean checkLength(String first, String second){
        if(first.length() == second.length()){
            return true;
        }else{
            System.out.println("Please enter words of the same length ");
            return false;
        }
    }
}
