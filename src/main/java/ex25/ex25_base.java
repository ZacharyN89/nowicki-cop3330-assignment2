/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki


Exercise 25 - Password Strength Indicator

Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

    A very weak password contains only numbers and is fewer than eight characters.
    A weak password contains only letters and is fewer than eight characters.
    A strong password contains letters and at least one number and is at least eight characters.
    A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output

The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints

    Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
    Use a single output statement.

Challenge

    Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result
*/

package ex25;

import java.util.Scanner;

public class ex25_base {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        passwordChecker checker = new passwordChecker();

        System.out.print("Please enter a password to be checked ");
        String password = in.next();

        int strength = checker.passwordValidator(password);
        String result = checker.printStrength(strength, password);

        System.out.println(result);
    }
}
