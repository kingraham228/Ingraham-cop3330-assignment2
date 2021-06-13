package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.Scanner;

public class Add {
    private static final Scanner input = new Scanner(System.in);
    private Double [] numbers = new Double[5];

    public void setNumbers(){
        for (int counter = 0; counter<5; counter++){
                System.out.println("Enter a number:");
                while (!input.hasNextDouble()) {
                    String str1 = input.next();
                    System.out.println(str1 + " is not a valid number. Try again.");
                }
                numbers[counter] = input.nextDouble();
        }

    }

    public double sumNumbers(){
        double sum = 0;
        for (double num: numbers){
            sum +=num;
        }
        return sum;
    }

    public void setTestNums(double a, double b, double c, double d, double e){
        numbers = new Double[]{a, b, c, d, e};
    }


}
