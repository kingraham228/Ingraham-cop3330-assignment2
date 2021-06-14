package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Promt for response times from a website in milliseconds
//Stop with "done"
//print average
//print min time
//print max time
//print standard dev
public class StatsPack {
    private static final Scanner input = new Scanner(System.in);
    ArrayList<Double> inputList = new ArrayList<>();

    public void fillList(){
        double userFill;
        int count = 0;
        boolean inputComplete = false;
        do{
            System.out.println("Enter a number: ");
            while (!input.hasNextDouble()){
                String str1 = input.nextLine();
                if(str1.equalsIgnoreCase("done")){
                    inputComplete = true;
                   break;
                }

            }
            if(inputComplete){
                break;
            }
            userFill = input.nextDouble();
            if (userFill < 0) {
                System.out.println("Milliseconds cannot be a negative value.");

            }else {
                if (userFill == 0){
                System.out.println("Milliseconds must be greater than zero.");
            } else{
                    inputList.add(count,userFill);
                    count++;
                }

            }

        }while(!inputComplete);

    }

    public ArrayList<Double> getInputList() {
        return inputList;
    }

    public void instructions(){
        System.out.println("Enter in response times from a website in milliseconds.");
        System.out.println("When you have finished entering times, type done.");
    }

    public void printList(){
        System.out.print("Numbers: ");
        for (int count = 0; count<inputList.size(); count++){
            if (count == (inputList.size()-1)){
                System.out.printf("%.2f%n", inputList.get(count));
            }else{
                System.out.printf("%.2f, ",inputList.get(count));
            }
        }
        System.out.printf("The average is %.2f%n",average(inputList) );
        System.out.printf("The minimum is %.2f%n",min(inputList));
        System.out.printf("The maximum is %.2f%n",max(inputList));
        System.out.printf("The standard deviation is %.2f%n",std(inputList));
    }

    public double average(ArrayList<Double> nums){
        double sum =0;
        for (int i = 0; i < nums.size(); i++) {
            Double num = nums.get(i);
            sum = sum + num;
        }
        if(nums.size() == 0){
            return 0;
        }else {
            return sum/nums.size();
        }


    }

    public double min(ArrayList<Double> nums){
        Collections.sort(nums);
        return nums.get(0);
    }

    public double max(ArrayList<Double> nums){
        Collections.sort(nums);
        return nums.get((nums.size()-1));
    }

    public double std(ArrayList<Double> nums){
        double average = average(nums);
        double [] calculations = new double[nums.size()];
        double calcaverage = 0;
        for(int count =0; count<nums.size(); count++){
            calculations[count] = (nums.get(count)) - average;
            calculations[count] = calculations[count] * calculations[count];
            calcaverage = calcaverage + calculations[count];
        }
        if (nums.size() == 0){
            return 0;
        }else{
            calcaverage = calcaverage/nums.size();
            return Math.sqrt(calcaverage);
        }
    }
}
