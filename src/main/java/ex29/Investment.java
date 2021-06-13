package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.Scanner;

public class Investment {
    private static final Scanner input = new Scanner(System.in);
    private double rateReturn;

    public void setRateReturn(){
        double inputRate;
        do {
            System.out.println("What is the rate of return?");
            while (!input.hasNextDouble()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid rate of return.");
                System.out.println("What is the rate of return?");
            }
            inputRate = input.nextDouble();
            if (inputRate < 0) {
                System.out.println("Rate of return cannot be a negative value.");
            }
            if (inputRate == 0){
                System.out.println("Rate of return must be greater than zero.");
            }
        } while (inputRate <= 0);
        rateReturn = inputRate;
    }

    public double getRateReturn() {
        return rateReturn;
    }

    public double calculateDoubleInvestment(double rReturn){
        double years;
        years = 72/rReturn;
        return years;
    }

    public String printDIResults(double rReturn){
        double ryears = calculateDoubleInvestment(rReturn);
        return String.format("It will take %.2f years to double your initial investment.", ryears);
    }

}
