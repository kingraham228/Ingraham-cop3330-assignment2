package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {

    public static void main(String[] args){
        Anagram userAnagram = new Anagram();

       System.out.println(userAnagram.getInstructions());
       userAnagram.setWords();
       String [] userWords = userAnagram.getWords();

       boolean test = userAnagram.isAnagram(userWords);
       String result = userAnagram.getPrintResult(test);

       System.out.println(result);


    }
}
