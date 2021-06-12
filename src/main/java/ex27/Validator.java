package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

//enter first name
//enter last name
//enter employee ID
//enter zip code
//validate first name and last names at lease 2 characters long and filled in
//employee ID forma AA-1234
//zip code must be a number

import java.util.Scanner;
import java.util.Arrays;

public class Validator {
    private static final Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String employeeID;
    private String zip;
    int [] errorCode = new int[4];


    public void setFirstName() {
        System.out.println("Enter the first name: ");
        this.firstName = input.nextLine();
    }

    public void setLastName() {
        System.out.println("Enter the last name: ");
        this.lastName = input.nextLine();
    }

    public void setEmployeeID() {
        this.employeeID = input.nextLine();
    }

    public void setZip() {
        this.zip = input.nextLine();
    }

    public void validateFirstName(){
        if(firstName.isBlank() || firstName.isEmpty()){
            errorCode[0] = 1;
        }else{
            if(firstName.length()<2){
                errorCode[0] = 2;
            } else {
                errorCode[0] = 0;
            }
        }
    }

    public void validateLastName(){
        if(lastName.isBlank() || lastName.isEmpty()){
            errorCode[1] = 3;
        }else{
            if(lastName.length()<2){
                errorCode[1] = 4;
            } else{
                errorCode[1] = 0;
            }
        }
    }

    public void validateZip(){
        String copyZip = zip;
        copyZip = removeWhiteSpace(copyZip);
        char [] zipCheck = copyZip.toCharArray();
        for(char c: zipCheck){
            if(!Character.isDigit(c)){
                errorCode[2] = 5;
            }
        }
        if (zip.length()<5){
            errorCode[2] = 5;
        }
    }

    public void validateEmployeeID(){
        if (employeeID.length() != 7){
            errorCode[3] = 6;
        } else {
            char[] idCheck = employeeID.toCharArray();
            if(!Character.isLetter(idCheck[0])||!Character.isLetter(idCheck[1])){
                errorCode [3] = 6;
            }else{
                if(!Character.isDefined('-')){
                    errorCode[3] = 6;
                } else{
                    if (!Character.isDigit(idCheck[3])||!Character.isDigit(idCheck[4])||!Character.isDigit(idCheck[5])||!Character.isDigit(idCheck[6])){
                        errorCode[3] = 6;
                    }else{
                        errorCode[3] = 6;
                    }
                }
            }

        }


    }

    public String printValidationReport(){
        if(Arrays.stream(errorCode).sum() == 0){
            return String.format("There were no errors found.");
        }else{
            String error1 = "The first name must be filled in.\n";
            String error2 = "The first name must be at least 2 characters long.\n";
            String error3 = "The last name must be filled in.\n";
            String error4 = "The last name must be at least 2 characters long.\n";
            String error5 = "The zipcode must be a 5 digit number.\n";
            String error6 = "The employee ID must be in the format of AA-1234.\n";
            String [] errors = new String[4];
            for(int count = 0; count <4; count++){
                String arrayAdd = switch(errorCode[count]){
                    case 1 -> error1;
                    case 2 -> error2;
                    case 3 -> error3;
                    case 4 -> error4;
                    case 5 -> error5;
                    case 6 -> error6;
                    default -> "";
                };
                errors[count] = arrayAdd;
            }
            return String.format(errors[0]+errors[1]+errors[2]+errors[3]+errors[4]);
        }

    }

    //remove white space from strings. Code modified from https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
    public String removeWhiteSpace(String s){
        s = s.replaceAll("\\s", "");
        return s;
    }

}
