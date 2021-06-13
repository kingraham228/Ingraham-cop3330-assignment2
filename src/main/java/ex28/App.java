package ex28;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App {
    public static void main(String[] args){
        Add userAdd = new Add();
        userAdd.setNumbers();
        double total = userAdd.sumNumbers();
        System.out.printf("The total is %.2f.%n",total);

    }

}
