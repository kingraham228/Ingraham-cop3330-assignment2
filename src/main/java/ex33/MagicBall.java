package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.Random;
import java.util.Scanner;

//prompts for a question and then displays yes/no/maybe/ask again later
//chosen randomly using a pseudo random number generator
public class MagicBall {
    private static final Scanner input = new Scanner(System.in);
    private static final String [] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};
    String question;

    public void setQuestion(){
        System.out.println("What's your question?");
        question = input.nextLine();
    }

    public String giveAnswer(){
        Random number = new Random();
        int answerSelect = number.nextInt(4);
        return answers[answerSelect];

    }


}
