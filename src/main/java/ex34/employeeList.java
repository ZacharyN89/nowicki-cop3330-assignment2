package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class employeeList {
    private static final Scanner in = new Scanner(System.in);
    private ArrayList<String> employees = new ArrayList<String>();

    public void makeList(){
        employees.add("Johnny Knoxville");
        employees.add("Moe Lester");
        employees.add("Al Capone");
        employees.add("Mr. Mime");
        employees.add("Action Bronson");
    }

    public void printList(){
        System.out.println("There are "+employees.size()+" employees: ");
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.println("");
    }

    public void removeFromList(){
        System.out.print("Enter an employee name to remove: ");
        int index = employees.indexOf(in.next());

        String kill = employees.remove(index);

        System.out.print("");
    }

    public int arraySize(){
        return employees.size();
    }
}
