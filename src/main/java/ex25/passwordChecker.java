/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Nowicki
 */
package ex25;

import java.util.Arrays;

public class passwordChecker {
    public int passwordValidator(String password){
        int passwordStrength = 0;

        boolean hasNumber = false;
        boolean hasLetter = false;
        boolean hasSpecialCharacter = false;

        char[] array = password.toCharArray();

        for (char c : array) {
            if (c >= '0' && c <= '9') {
                hasNumber = true;
            }

            if (c >= 'a' && c <= 'z') {
                hasLetter = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;
            }
        }


        if(array.length<8){
            if(hasNumber && !hasLetter){
                passwordStrength = 1;
            }
            if(!hasNumber && hasLetter){
                passwordStrength = 2;
            }
        }else{
            if(hasNumber && hasLetter){
                passwordStrength = 3;
            }
            if(hasNumber && hasLetter && hasSpecialCharacter){
                passwordStrength = 4;
            }
        }

        return passwordStrength;
    }

    public String printStrength(int x, String password){
        return switch (x) {
            case 0 -> password + " is not a recognizable password.";
            case 1 -> "The password '" + password + "' is a very weak password.";
            case 2 -> "The password '" + password + "' is a weak password.";
            case 3 -> "The password '" + password + "' is a strong password.";
            case 4 -> "The password '" + password + "' is a very strong password.";
            default -> "";
        };
    }
}
