package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        Lottery userContest = new Lottery();
        userContest.fillList();
        String winner = userContest.selectWinner();
        System.out.println("The winner is... "+winner+".");
    }

}
