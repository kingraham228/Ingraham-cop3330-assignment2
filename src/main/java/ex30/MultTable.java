package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class MultTable {

    public int[] fillArray(int row){
       int [] fill = new int[12];
       for (int count = 0; count<12; count++){

           fill[count] = row * (count+1);
       }
       return fill;
    }

    public int [][] makeTable(){
        int [][] table = new int[12][12];
        int rcount;
        for (rcount =0; rcount<12; rcount++){
           table[rcount] = fillArray((rcount+1));
        }
        return table;

    }


    public void printMultiplicationTable(int[][] table){
        for (int row = 0; row< table.length; row++){
            for (int column = 0; column<table[row].length; column++){
                int printInt = table[row][column];
                System.out.printf("%5d", printInt);
            }
            System.out.println("");
        }

    }



}
