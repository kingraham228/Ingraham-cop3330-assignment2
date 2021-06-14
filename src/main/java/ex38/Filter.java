package ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;
import java.util.Scanner;

//convert input to an array
//make function filterEvenNumbers, returns array
//print out a new list containing only even numbers
public class Filter {
    private static final Scanner input = new Scanner(System.in);
    private String userInput;

    public void setUserInput(){
            System.out.println("Enter a a list of numbers, separated by spaces: ");
            userInput = input.nextLine();
    }

    public String getUserInput() {
        return userInput;
    }

    public String [] stringToStringArray(String userStr){
       return userStr.split(" ");
    }


}
