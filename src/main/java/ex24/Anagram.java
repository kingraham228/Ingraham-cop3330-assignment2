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

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private static final Scanner input = new Scanner(System.in);
    private String [] words = new String[2];
    private int wordCount;
    private String error = "";

    public void setWords(){
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

    }

    public String[] getWords() {
        return words;
    }

    public String getInstructions(){
        return "Enter two strings and I'll tell you if they are anagrams: ";
    }

    public String getLengthError(){ return "These strings are not the same length.\n";}

    public String getPrintResult(boolean test) {
        String printResult;
        if (test){
            printResult = "\""+words[0]+"\" and \""+words[1]+"\" are anagrams.";
        }else {
            printResult = error+"\""+words[0]+"\" and \""+words[1]+"\" are not anagrams.";
        }
        return printResult;
    }

    public boolean isAnagram(String [] anaTest){
        if (!isSameLength(anaTest)){
            error = getLengthError();
            return false;
        }else {

            String [] copyArray = new String[2];
            copyArray[0] = removeWhiteSpace(anaTest[0]);
            copyArray[1] = removeWhiteSpace(anaTest[1]);

            char[] checkWord1 = copyArray[0].toCharArray();
            char[] checkWord2 = copyArray[1].toCharArray();

            for (int n = 0; n < checkWord1.length; n++) {
                checkWord1[n] = Character.toLowerCase(checkWord1[n]);
            }

            for (int count = 0; count < checkWord2.length; count++) {
                checkWord2[count] = Character.toLowerCase(checkWord2[count]);
            }

            Arrays.sort(checkWord1);
            Arrays.sort(checkWord2);

            return Arrays.equals(checkWord1, checkWord2);
        }

    }

    public boolean isSameLength(String [] lengthTest){
        String [] copyArray = new String[2];
        copyArray[0] = removeWhiteSpace(lengthTest[0]);
        copyArray[1] = removeWhiteSpace(lengthTest[1]);

        char [] stringLength1 = copyArray[0].toCharArray();
        char [] stringLength2 = copyArray[1].toCharArray();
        return stringLength1.length == stringLength2.length;

    }

    public void testSetWords(String a, String b){
        words[0] = a;
        words[1] = b;
    }

    //remove white space from strings. Code modified from https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
    public String removeWhiteSpace(String s){
        s = s.replaceAll("\\s", "");
        return s;
    }
}
