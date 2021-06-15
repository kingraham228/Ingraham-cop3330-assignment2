package ex40;


import java.util.Arrays;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String [] args){
        RecordMap40 employees = new RecordMap40();
        employees.fillNameMap();
        employees.fillPositionMap();
        employees.fillSepMap();
        String search = employees.getSearchString();
        employees.search(search);


    }
}
