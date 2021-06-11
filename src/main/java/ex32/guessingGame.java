/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex32;

import java.util.Scanner;

public class guessingGame {
    private static final Scanner in = new Scanner(System.in);

    public int getDifficulty(){
        System.out.print("Enter the difficulty level (1,2, or 3): ");
        return checkDifficulty();
    }

    public void game(){
        int numGuesses;
        int guess;
        int answer;
        boolean playAgain = true;

        while(playAgain){
            //set guess number
            guess=0;
            numGuesses=0;

            answer = ((int) (Math.random()*(Math.pow(10,getDifficulty())))) + 1;
            System.out.print("I have my number. What's your guess? ");

            //play game loop
            while(guess != answer){
                guess = check(in.next());
                numGuesses++;
                if(guess == answer){
                    System.out.println("You got it in "+numGuesses+" guesses!");
                }
                else if(guess == -1){
                    System.out.print("Wrong. What's your guess? ");
                }
                else if(guess < answer){
                    System.out.print("Too low. Guess again: ");
                }
                else if(guess > answer){
                    System.out.print("Too high. Guess again: ");
                }
            }

            //ask to play again
            playAgain = askAgain();
        }


    }

    public boolean askAgain(){
        System.out.print("Do you wish to play again (Y/N)? ");
        String input = in.next();
        if(input.equals("Y")  || input.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }

    public int checkDifficulty(){
        while(true) {
            try {
                return Integer.parseInt(in.next());
            } catch (NumberFormatException e) {
                System.out.print("The input must be numeric. Please enter a number now.\n");
            }
        }
    }

    public int check(String x){
        while(true) {
            try {
                return Integer.parseInt(x);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }
}
