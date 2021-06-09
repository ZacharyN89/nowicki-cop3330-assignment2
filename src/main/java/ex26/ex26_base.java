/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki


Exercise 26 - Months to Pay Off a Credit Card

It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

where

    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment.

Example Output

What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

Constraints

    Prompt for the card’s APR. Do the division internally.
    Prompt for the APR as a percentage, not a decimal.
    Use a function called calculateMonthsUntilPaidOff, which accepts the balance, the APR, and the monthly payment as its arguments and returns the number of months. Don’t access any of these values outside the function.
    Round fractions of a cent up to the next cent.

Challenge

    Rework the formula so the program can accept the number of months as an input and compute the monthly payment.
    Create a version of the program that lets the user choose whether to figure out the number of months until payoff or the amount needed to pay per month.
*/

package ex26;

import java.util.Scanner;

public class ex26_base {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is your balance? " );
        double balance = Double.parseDouble(in.next());

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = Double.parseDouble(in.next()) / 100;

        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = Double.parseDouble(in.next());

        creditCalculator calc = new creditCalculator();
        double result = calc.calculateMonthsUntilPaidOff(balance,APR,monthlyPayment);


        System.out.print("It will take you "+result+" months to pay off this card.");
    }
}
