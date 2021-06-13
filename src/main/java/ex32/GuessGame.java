package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.security.SecureRandom;
import java.util.Scanner;


public class GuessGame {
    private static final Scanner input = new Scanner(System.in);
    private int secretNumber;
    private int level;

    public void setLevel(){
        int inputLevel;
        System.out.println("Let's play Guess the Number!");
        do {
            System.out.println("Enter the difficulty level (1,2,or 3): ");
            while (!input.hasNextInt()) {
                String str1 = input.nextLine();
                System.out.println(str1 + " is not a valid level.");
                System.out.println("Enter the difficulty level (1,2,or 3): ");
            }
            inputLevel = input.nextInt();
            if (inputLevel < 1 || inputLevel > 3 ) {
                System.out.println("The difficulty level must be 1, 2, or 3.");
                inputLevel = -1;
            }

        } while (inputLevel < 0);
        level = inputLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setSecretNumber(int level){
        SecureRandom randomNumber = new SecureRandom();
        if(level == 1){
            secretNumber = 1 + randomNumber.nextInt(10);
        } else{
            if(level == 2){
                secretNumber = 1 + randomNumber.nextInt(100);
            } else{
                secretNumber = 1 + randomNumber.nextInt(1000);
            }
        }
        System.out.println("I have my number.");
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void guessNumber(){
        int guessCount = 0;
        int guessNumber = 0;
        System.out.println("What's your guess?");
        do{
                if (!input.hasNextInt()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid guess.");
                System.out.println("Enter a whole number greater than zero.");
                guessCount++;
                } else{

                guessNumber = input.nextInt();

            if (guessNumber>secretNumber){
                System.out.println("Too high. Guess again: ");
                guessCount++;
            }

            if(guessNumber<secretNumber){
                System.out.println("Too low. Guess again: ");
                guessCount++;
            }
                }
        } while(guessNumber != secretNumber);
        int totalGuesses = guessCount+1;
        System.out.println("You got it in "+totalGuesses+" guesses!");
    }

    public void playAgain(){
        int playInput;
        String playStatus;
        input.nextLine();
        System.out.println("Would you like to play again (Y/N)?");
        do{
            playStatus = input.nextLine();
            if (playStatus.equalsIgnoreCase("Y")||playStatus.equalsIgnoreCase("N")||playStatus.equalsIgnoreCase("Yes")||playStatus.equalsIgnoreCase("No")){
                playInput = 1;
            } else{
                playInput = -1;
                System.out.println("Invalid input. Please select Yes or No.");
            }
        }while(playInput<0);

        if (playStatus.equalsIgnoreCase("Y")||playStatus.equalsIgnoreCase("Yes")){
            setLevel();
            setSecretNumber(level);
            guessNumber();
            playAgain();
        }else{
            System.out.println("Thanks for playing.");
        }
    }
}
