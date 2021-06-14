package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        PasswordGenerator userP = new PasswordGenerator();
        int length = userP.getPLength();
        int specialChars = userP.getNumSpecial();
        int numbers = userP.getNumNum();
        String uPassword = userP.generatePassword(length,specialChars,numbers);
        System.out.println("Your password is "+uPassword);
    }

}
