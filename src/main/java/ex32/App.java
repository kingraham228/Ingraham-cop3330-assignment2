package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        GuessGame userGame = new GuessGame();
        userGame.setLevel();
        int gameLevel = userGame.getLevel();
        userGame.setSecretNumber(gameLevel);
        userGame.guessNumber();
        userGame.playAgain();
    }

}
