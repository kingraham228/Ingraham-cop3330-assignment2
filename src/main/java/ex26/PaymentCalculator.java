package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class PaymentCalculator {
    private static final Scanner input = new Scanner(System.in);
    private BigDecimal cardBalance;
    private BigDecimal apr;
    private BigDecimal monthlyPayment;

    public void setCardBalance(){
        double inputCard;
        do {
            System.out.println("What is your balance?");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid balance amount.");
                System.out.println("What is your balance?");
            }
            inputCard = input.nextDouble();
            if (inputCard < 0) {
                System.out.println("Balance amount cannot be a negative value.");
            }
        } while (inputCard < 0);
        cardBalance = BigDecimal.valueOf(inputCard);
    }

    public void setApr(){
        double inputAPR;
        do {
            System.out.println("What is the APR on the card (as a percent)?");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid apr.");
                System.out.println("What is the APR on the card (as a percent)?");
            }
            inputAPR = input.nextDouble();
            if (inputAPR < 0) {
                System.out.println("APR cannot be a negative value.");
            }
        } while (inputAPR < 0);
        apr = BigDecimal.valueOf(inputAPR/100);
    }

    public void setMonthlyPayment(){
        double inputMonthlyPayment;
        do {
            System.out.println("What is the monthly payment you can make?");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid monthly payment.");
                System.out.println("What is the monthly payment you can make?");
            }
            inputMonthlyPayment = input.nextDouble();
            if (inputMonthlyPayment < 0) {
                System.out.println("Monthly payment cannot be a negative value.");
            }
        } while (inputMonthlyPayment < 0);
        monthlyPayment = BigDecimal.valueOf(inputMonthlyPayment);
    }

    public int calculateMonthsUntilPaidOff(){

        BigDecimal i = apr.divide(BigDecimal.valueOf(365),6,RoundingMode.UP);
        BigDecimal step1 = i.add(BigDecimal.ONE);
        BigDecimal step2 = step1.pow(30);
        BigDecimal step3 = BigDecimal.ONE.subtract(step2);
        BigDecimal step4 = cardBalance.divide(monthlyPayment, 6,RoundingMode.UP);
        BigDecimal step5 = step4.multiply(step3);
        BigDecimal step6 = step5.add(BigDecimal.ONE);
        BigDecimal term2 = BigDecimal.valueOf(Math.log(step6.doubleValue()));
        BigDecimal term1a = BigDecimal.ONE.divide(BigDecimal.valueOf(30),6,RoundingMode.UP);
        BigDecimal term1b = BigDecimal.ZERO.subtract(term1a);
        BigDecimal step7 = i.add(BigDecimal.ONE);
        BigDecimal term3 = BigDecimal.valueOf(Math.log(step7.doubleValue()));
        BigDecimal step8 = term1b.multiply(term2);
        BigDecimal result = step8.divide(term3, 6,RoundingMode.UP);
        result = result.setScale(0, RoundingMode.UP);

        return result.intValue();
    }

    public String printMonths(int months){
        return String.format("It will take you %d months to pay off this card.", months);
    }

    public void setTestParameters(double cb, double pAPR, double mp){
        cardBalance = BigDecimal.valueOf(cb);
        apr = BigDecimal.valueOf(pAPR);
        monthlyPayment = BigDecimal.valueOf(mp);
    }
}
