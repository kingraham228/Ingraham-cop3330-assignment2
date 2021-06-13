package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App {

    public static void main(String [] args){
        Investment userInvest = new Investment();
        userInvest.setRateReturn();
        double userRR = userInvest.getRateReturn();
        System.out.println(userInvest.printDIResults(userRR));

    }

}
