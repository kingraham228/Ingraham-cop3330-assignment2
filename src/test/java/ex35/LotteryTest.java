package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {


    @Test
    @DisplayName("Selection Test for Random")
    void selectWinner_randomTest() {
        Lottery test = new Lottery();
        test.testFill();
        int homercount =0;
        int bartcount =0;
        int maggiecount =0;
        int lisacount =0;
        int errorcount = 0;
        for(int count = 0; count<1000; count++){
            String winner = test.selectWinner();
            switch (winner) {
                case "Homer" -> homercount++;
                case "Bart" -> bartcount++;
                case "Maggie" -> maggiecount++;
                case "Lisa" -> lisacount++;
                default -> errorcount++;
            }
        }
        System.out.println("Homer count: "+homercount);
        System.out.println("Bart count: "+bartcount);
        System.out.println("Maggie count: "+maggiecount);
        System.out.println("Lisa count: "+lisacount);

        assertEquals(0,errorcount);
    }
}