package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class HeartRate {
    private static final Scanner input = new Scanner(System.in);
    private double age;
    private double resting;

    public void setAge(){
        double inputAge;
        do {
            System.out.println("What is your age?");
            while (!input.hasNextDouble()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid age.");
                System.out.println("What is your age?");
            }
            inputAge = input.nextDouble();
            if (inputAge < 0) {
                System.out.println("Age cannot be a negative value.");
            }
            if (inputAge == 0){
                System.out.println("Age must be greater than zero.");
            }
        } while (inputAge <= 0);
        age = inputAge;
    }

    public void setResting(){
        double inputresting;
        do {
            System.out.println("What is your resting heart rate?");
            while (!input.hasNextDouble()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid heart rate.");
                System.out.println("What is your resting heart rate?");
            }
            inputresting = input.nextDouble();
            if (inputresting < 0) {
                System.out.println("Heart rate cannot be a negative value.");
            }
            if (inputresting == 0){
                System.out.println("Heart rate must be greater than zero.");
            }
        } while (inputresting <= 0);
        resting = inputresting;
    }

    public String calculateHeartRate(double age, double resting, double intensity){
        double calcStep1 = (220-age);
        double calcStep2 = calcStep1-resting;
        double calcStep3 = calcStep2*intensity;
        double targetHeartRate = calcStep3 + resting;
        BigDecimal thr = BigDecimal.valueOf(targetHeartRate);
        thr = thr.setScale(0, RoundingMode.HALF_UP);
        return String.format("%.0f",thr);
    }

    public void printHeartTable(){
        BigDecimal rhr = BigDecimal.valueOf(resting);
        rhr = rhr.setScale(0,RoundingMode.HALF_UP);
        String printResting = rhr.toString();
        BigDecimal a = BigDecimal.valueOf(age);
        a = a.setScale(0,RoundingMode.HALF_UP);
        String printAge = a.toString();
        String [] heading = {"Intensity", "Rate"};
        double intensity = .55;
        double percentI;

        System.out.printf("Resting Pulse: %s\t\tAge: %s%n%n",printResting,printAge);
        System.out.printf("%-15s |  %-15s %n", heading[0],heading[1]);
        System.out.println("----------------|-----------------");
        do{
            percentI = intensity*100;
            String printa = String.format("%.0f%%",percentI);
            String printb = String.format("%s bpm",calculateHeartRate(age,resting,intensity));
            System.out.printf("%-15s |  %-15s %n", printa,printb);
            intensity = intensity+.05;
        }while(intensity < 1);




    }


}
