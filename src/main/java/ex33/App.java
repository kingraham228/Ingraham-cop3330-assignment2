package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String [] args){
        MagicBall userBall = new MagicBall();
        userBall.setQuestion();
        String answer = userBall.giveAnswer();
        System.out.println(answer);
    }

}
