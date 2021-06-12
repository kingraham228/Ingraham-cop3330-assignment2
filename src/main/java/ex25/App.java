package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        Password userPassword = new Password();
        userPassword.setPassword();
        String myPassword = userPassword.getPassword();
        String result = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        System.out.println(result);

    }
}
