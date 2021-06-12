package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App {
    public static void main(String [] args){
        PaymentCalculator userPayment = new PaymentCalculator();
        userPayment.setCardBalance();
        userPayment.setApr();
        userPayment.setMonthlyPayment();
        int myMonths = userPayment.calculateMonthsUntilPaidOff();
        System.out.println(userPayment.printMonths(myMonths));
    }


}
