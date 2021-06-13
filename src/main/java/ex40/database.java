/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/

package ex40;

import java.util.*;

public class database {
    private ArrayList<Map> data = new ArrayList<Map>();
    public void makeDatabase(){
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Firstname","John");
        employee1.put("Lastname","Johnson");
        employee1.put("Position","Manager");
        employee1.put("Separation Date","2016-12-31");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Firstname","Tou");
        employee2.put("Lastname","Xiong");
        employee2.put("Position","Software Engineer");
        employee2.put("Separation Date","2016-10-05");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("Firstname","Michaela");
        employee3.put("Lastname","Michaelson");
        employee3.put("Position","District Manager");
        employee3.put("Separation Date","2015-12-19");

        Map<String, String> employee4 = new HashMap<>();
        employee4.put("Firstname","Jake");
        employee4.put("Lastname","Jacobson");
        employee4.put("Position","Programmer");
        employee4.put("Separation Date","");

        Map<String, String> employee5 = new HashMap<>();
        employee5.put("Firstname","Jacquelyn");
        employee5.put("Lastname","Jackson");
        employee5.put("Position","DBA");
        employee5.put("Separation Date","");

        Map<String, String> employee6 = new HashMap<>();
        employee6.put("Firstname","Sally");
        employee6.put("Lastname","Webber");
        employee6.put("Position","Web Developer");
        employee6.put("Separation Date","2015-12-18");

        data.add(employee1);
        data.add(employee2);
        data.add(employee3);
        data.add(employee4);
        data.add(employee5);
        data.add(employee6);
    }

    public void containsString(String find){
        //make a string of the lastnames and sort it. Save as a list of integers.
        Map<String , String> tool;

        for(int i=0; i<data.size(); i++){
            tool = data.get(i);
            String firstnameCheck = tool.get("Firstname");
            String lastnameCheck = tool.get("Lastname");
            if (firstnameCheck.contains(find) || lastnameCheck.contains(find)){

            } else {
                data.remove(i);
                i--;
            }
        }
    }

    public void printDatabase(){
        String result = "Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n";

        for(int i=0; i<data.size(); i++){
            Map<String , String> tool = data.get(i);
            String name = tool.get("Firstname") + " " + tool.get("Lastname");
            String format = String.format("%-20s|",name) +String.format("%-19s|",tool.get("Position")) +String.format("%-20s",tool.get("Separation Date")) + "\n";
            result += format ;
        }
        System.out.print(result);
    }
}
