package ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;
import java.util.Scanner;



public class Filter {
    private static final Scanner input = new Scanner(System.in);
    private String userInput;

    public void setUserInput() {
        System.out.println("Enter a list of whole numbers, separated by spaces: ");
        userInput = input.nextLine();
    }

    public String getUserInput() {
        return userInput;
    }

    public String[] stringToStringArray(String userStr) {
        return userStr.split(" ");
    }

    public double[] removeNonNums(String[] split) {
        ArrayList<Double> doubleNumbers = new ArrayList<>();
        for (String s : split) {

            try {
                double convert = Double.parseDouble(s);
                doubleNumbers.add(convert);
            } catch (NumberFormatException ignored) {

            }

        }
        double[] onlyNums = new double[doubleNumbers.size()];
        for (int count = 0; count < (onlyNums.length); count++) {
            onlyNums[count] = doubleNumbers.get(count);
        }
        return onlyNums;
    }



    public double [] filterEvenNumbers(double [] numArrray){
        ArrayList<Double> filterEven = new ArrayList<>();
        for (double v : numArrray) {
            double modCheck = v % 2;
            if (modCheck == 0) {
                filterEven.add(v);
            }
        }

        double [] evenNums = new double[filterEven.size()];
        for (int count=0; count< evenNums.length; count++){
            evenNums[count] = filterEven.get(count);
        }
        return evenNums;
    }

    public void printEvenNumbers(double [] arrayNums){
        System.out.print("The even whole numbers are ");
        for (double arrayNum : arrayNums) {
            System.out.printf("%.0f ", arrayNum);
        }
        System.out.printf("%n");
    }

}
