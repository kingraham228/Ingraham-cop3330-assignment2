package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */



public class App {
    public static void main(String[] args){
        HeartRate userHeartRate = new HeartRate();
        userHeartRate.setAge();
        userHeartRate.setResting();
        userHeartRate.printHeartTable();
    }

}
