package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String [] args){
        RecordMap employees = new RecordMap();
        employees.fillNameMap();
        employees.fillPositionMap();
        employees.fillSepMap();
        employees.formatedPrint();

    }
}
