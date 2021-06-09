/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex27;

import java.util.Arrays;

public class inputChecker {
    public void validateInput(employee person){
        String result = "";
        result += checkFirstname(person.getFirstname());
        result += checkLastname(person.getLastname());
        result += checkZip(person.getZipcode());
        result += checkID(person.getID());

        System.out.print(result);
    }

    public String checkFirstname(String name){
        if(name.equals("")){
            return "The first name must be filled in.\n";
        }
        else if(name.length()<2){
            return "\""+name+"\" is not a valid first name. It is too short.\n";
        }
        return "";
    }

    public String checkLastname(String name){
        if(name.equals("")){
            return "The last name must be filled in.\n";
        }
        else if(name.length()<2){
            return "\""+name+"\" is not a valid last name. It is too short.\n";
        }
        return "";
    }

    public String checkZip(String zipcode){
        try {
            Double.parseDouble(zipcode);
        } catch(NumberFormatException e){
            return "The ZIP code must be numeric.\n";
        }
        return "";
    }

    public String checkID(String ID){
        char[] ID_array = ID.toCharArray();
        String result = "";

        if(ID_array.length != 7){
            result = ID + " is not a valid ID.";
            return result;
        }

        if(!Character.isLetter(ID_array[0]) || !Character.isLetter(ID_array[1])){
            result = ID + " is not a valid ID.";
        }

        if(!(ID_array[2] == '-')){
            result = ID + " is not a valid ID.";
        }

        if(!Character.isDigit(ID_array[3]) || !Character.isDigit(ID_array[4]) || !Character.isDigit(ID_array[5]) || !Character.isDigit(ID_array[6])){
            result = ID + " is not a valid ID.";
        }

        return result;
    }
}
