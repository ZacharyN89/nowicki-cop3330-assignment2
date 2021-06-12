/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex37;

import java.util.Scanner;

public class passwordMaker {
    private static final Scanner in = new Scanner(System.in);
    public void setPassword(){
        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(in.next());
        System.out.print("How many special characters? ");
        int sc = Integer.parseInt(in.next());
        System.out.print("How many numbers? ");
        int nums = Integer.parseInt(in.next());
        System.out.print(makePassword(length, sc, nums));
    }
    public String makePassword(int minLen, int sc, int num){
        String result = "";
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        char[] special = {'!','@','#','$','%','?','&','*'};

        //find the length
        int length = (sc+num)*2;
        if(length<minLen){
            length = minLen;
        }

        int numLetters = length-num-sc;
        int numNumbers = num;
        int numSpecial = sc;
        for(int i=0; i<length; i++){
            int choose = (int) (Math.random()*3);
            switch(choose){
                case 0:
                    if(numLetters != 0){
                        result += letters[(int)(Math.random()*24)];
                    }
                    else{
                        i++;
                    }
                    break;
                case 1:
                    if(numNumbers != 0){
                        result += numbers[(int)(Math.random()*10)];

                    }
                    else{
                        i++;
                    }
                    break;
                case 2:
                    if(numSpecial != 0){
                        result += special[(int)(Math.random()*8)];

                    }
                    else{
                        i++;
                    }
                    break;
            }

        }
        return result;
    }
}
