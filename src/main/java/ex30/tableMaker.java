/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Zachary Nowicki
*/
package ex30;

public class tableMaker {

    public String makeTable(int x){
        String result = "";
        String line;
        int specifier = findSpecifier(x);
        for(int i=1; i<=x; i++){
            line = "";
            for(int j=1; j<=x; j++){
                String add = String.format("%"+specifier+"d",i*j);
                line += add;
            }
            result += line + "\n";
        }
        return result;
    }

    public int findSpecifier(int x){
        int check = x*x;

        int count = 0;
        while(check != 0){
            check /= 10;
            count++;
        }
        return count+1;
    }
}
