/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki


Exercise 39 - Sorting Records

When you’re looking at results, you’ll want to be able to sort them so you can find what you’re looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.
First Name 	Last Name 	Position 	Separation Date
John 	Johnson 	Manager 	2016-12-31
Tou 	Xiong 	Software Engineer 	2016-10-05
Michaela 	Michaelson 	District Manager 	2015-12-19
Jake 	Jacobson 	Programmer
Jacquelyn 	Jackson 	DBA
Sally 	Webber 	Web Developer 	2015-12-18


Example Output

Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05

Constraint

    Store the data using a list of maps.

Challenges

    Prompt for how the records should be sorted. Allow sorting by separation date, position, or last name.
    Use a database such as MySQL, or a key-value store such as Redis, to store the employee records. Retrieve the records from the data store.

 */

package ex39;

public class ex39_base {
    public static void main(String[] args){
        database run = new database();
        run.makeDatabase();
        run.printByLastName();;
    }
}
