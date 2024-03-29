package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main (String[] args){
        Filter userF = new Filter();
        userF.setUserInput();
        String input = userF.getUserInput();
        String [] inArray = userF.stringToStringArray(input);
        double [] cleaning = userF.removeNonNums(inArray);
        double [] evenNums = userF.filterEvenNumbers(cleaning);
        userF.printEvenNumbers(evenNums);
    }
}
