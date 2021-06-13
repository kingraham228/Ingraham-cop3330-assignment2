package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {

    @Test
    @DisplayName("Level Setting Test 1")
    void setSecretNumber_levelsettest1() {
        GuessGame test = new GuessGame();
        int level = 1;
        test.setSecretNumber(level);
        int actual = test.getSecretNumber();

        assertTrue(actual <= 10);

    }

    @Test
    @DisplayName("Level Setting Test 2")
    void setSecretNumber_levelsettest2() {
        GuessGame test = new GuessGame();
        int level = 2;
        test.setSecretNumber(level);
        int actual = test.getSecretNumber();

        assertTrue(actual <= 100);

    }

    @Test
    @DisplayName("Level Setting Test 3")
    void setSecretNumber_levelsettest3() {
        GuessGame test = new GuessGame();
        int level = 3;
        test.setSecretNumber(level);
        int actual = test.getSecretNumber();

        assertTrue(actual <= 1000);

    }

}