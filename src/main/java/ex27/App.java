package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App {
    public static void main(String[] args){
        Validator user = new Validator();
        user.setInput();
        user.validateInput();
        String validationResult = user.printValidationReport();
        System.out.println(validationResult);

    }

}
