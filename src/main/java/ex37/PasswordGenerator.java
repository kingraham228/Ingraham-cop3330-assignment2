package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner input = new Scanner(System.in);
    private static final String [] arrayLetters = { "A", "B", "C", "D", "E","F", "G", "H", "I", "J", "K", "L","M", "N", "O",
    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a","b","c","d","e","f","g","h","i","j","k","l","m","n",
    "o","p","q","r","s","t","u","v","w","x","y","z"};
    private static final String [] arrayDigits = {"0","1","2","3","4","5","6","7","8","9"};
    private static final String [] arraySpecials = {"~","+","!","@","#","$","%","^","&","*","?","-"};
    private List<String> letters = Arrays.asList(arrayLetters);
    private List<String> digits = Arrays.asList(arrayDigits);
    private List<String> specials = Arrays.asList(arraySpecials);
    private int pLength;
    private int numSpecial;
    private int numNum;
    private int numLetters;



    public int getPLength(){
        do {
            System.out.println("What's the minimum length?");
            while (!input.hasNextInt()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid length.");
                System.out.println("What's the minimum length?");
            }
            pLength = input.nextInt();
            if (pLength < 0) {
                System.out.println("Minimum length cannot be a negative value.");
            }
            if (pLength == 0){
                System.out.println("Minimum length must be greater than zero.");
            }
        } while (pLength <= 0);
        return pLength;
    }
    public int getNumSpecial(){
        do {
            System.out.println("How many special characters?");
            while (!input.hasNextInt()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid number.");
                System.out.println("How many special characters?");
            }
            numSpecial = input.nextInt();
            if (numSpecial < 0) {
                System.out.println("Special character amount cannot be a negative value.");
            }
            if (numSpecial == 0){
                System.out.println("Special character amount must be greater than zero.");
            }
        } while (numSpecial <= 0);
        return numSpecial;
    }

    public int getNumNum(){
        do {
            System.out.println("How many numbers?");
            while (!input.hasNextInt()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid number.");
                System.out.println("How many numbers?");
            }
            numNum = input.nextInt();
            if (numNum < 0) {
                System.out.println("Number amount cannot be a negative value.");
            }
            if (numNum == 0){
                System.out.println("Number amount must be greater than zero.");
            }
        } while (numNum <= 0);
        return numNum;
    }

    //Generate password using those inputs
//ensure that password is random

    public String generatePassword(int minLength, int specChar, int nums){
        String password = "";
        return password;
    }

    public String[] buildPArray(int finLength, int nLetters, int specChar, int nums){
        String [] bPassword = new String[finLength];
        SecureRandom randomNum = new SecureRandom();
        int icount =0;
        for (int lcount = 0; lcount<nLetters; lcount++){
            int selectRan = randomNum.nextInt(letters.size());
            bPassword[lcount] = letters.get(selectRan);
            icount ++;
        }
        for (int scount = 0; scount<specChar; scount++){
            int selectRan = randomNum.nextInt(specials.size());
            bPassword[icount] = specials.get(selectRan);
            icount++;
        }
        for (int ncount = 0; ncount<nums; ncount++){
            int selectRan = randomNum.nextInt(digits.size());
            bPassword[icount] = digits.get(selectRan);
            icount++;
        }
        System.out.println("icount: "+icount);
        System.out.println("array size: "+bPassword.length);
        return bPassword;
    }

    public int getPassFinalLength(int minLength, int specChar, int nums){
        int fLength;
        numLetters = minLength-(specChar+nums);
        if (numLetters >= (specChar+nums)){
            fLength = minLength;
        }else{
            int ldifference = (specChar+nums) - numLetters;
            fLength = minLength+ldifference;
            numLetters = (fLength-(specChar+nums));
        }
        return fLength;
    }

    public int getNumLetters() {
        return numLetters;
    }
}
