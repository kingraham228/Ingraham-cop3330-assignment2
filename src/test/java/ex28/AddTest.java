package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    @DisplayName("Basic sums")
    void sumNumbers_basictest() {
        Add userAdd = new Add();
        userAdd.setTestNums(1,2,3,4,5);
        double actual = userAdd.sumNumbers();
        double expected = 15.00;

        assertEquals(expected,actual,.0001);
    }

    @Test
    @DisplayName("negative numbers")
    void sumNumbers_negativenumbers() {
        Add userAdd = new Add();
        userAdd.setTestNums(-47,-8,-244,-15,-12);
        double actual = userAdd.sumNumbers();
        double expected = -326.00;

        assertEquals(expected,actual,.0001);
    }

    @Test
    @DisplayName("fractions")
    void sumNumbers_fractions() {
        Add userAdd = new Add();
        userAdd.setTestNums(.52, .008, .64, -.87, .024);
        double actual = userAdd.sumNumbers();
        double expected = .322;

        assertEquals(expected,actual,.0001);
    }
}