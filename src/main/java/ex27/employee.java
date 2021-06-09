/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex27;

import java.util.Scanner;

public class employee {
    private String firstname;
    private String lastname;
    private String zipcode;
    private String ID;

    private static final Scanner in = new Scanner(System.in);

    public employee(){
        System.out.print("Enter the first name: ");
        firstname = in.next();

        System.out.print("Enter the last name: ");
        lastname = in.next();

        System.out.print("Enter the ZIP code: ");
        zipcode = in.next();

        System.out.print("Enter an employee ID: ");
        ID = in.next();
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getZipcode(){
        return zipcode;
    }

    public String getID(){
        return ID;
    }

}
