/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Nowicki
 */
/*
Exercise 24 - Anagram Checker

Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.
Example Output

Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints

    Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
    Check that both words are the same length.

Challenge

    Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.
*/
package ex24;

public class ex24_base {
    public static void main(String[] args){
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        AnagramDetector solution = new AnagramDetector();
        solution.isAnagram();
    }
}
//How do you refactor parameters and add a prompt?
