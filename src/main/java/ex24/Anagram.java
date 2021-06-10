package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
/*Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
Invoke this function from your main program.
Check that both words are the same length.*/

import java.util.Scanner;

public class Anagram {
    private static final Scanner input = new Scanner(System.in);
    private String [] words = new String[2];
    private int wordCount;

    public String [] getWords(){
        do{
            String wordOrder;
            if (wordCount == 0) {
                wordOrder = "first";
            }else {
                wordOrder = "second";
            }

            System.out.println("Enter the "+wordOrder+" string: ");
            words[wordCount] = input.nextLine();
            wordCount++;

        } while (wordCount<2);

        return words;

    }

    public String getInstructions(){
        return "Enter two strings and I'll tell you if they are anagrams: ";
    }
}
