package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {

    public static void main(String[] args){
        MultTable userTable = new MultTable();
        int [][] uTable = userTable.makeTable();
        userTable.printMultiplicationTable(uTable);

    }

}
