package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentTest {

    @Test
    @DisplayName("Given Input Test")
    void calculateDoubleInvestment() {
        Investment testInv = new Investment();
        double parameter = 4;
        double actual = testInv.calculateDoubleInvestment(parameter);
        double expected = 18;

        assertEquals(expected,actual,.0001);

    }

    @Test
    @DisplayName("Tiny")
    void calculateDoubleInvestment_tiny() {
        Investment testInv = new Investment();
        double parameter = .0000001;
        double actual = testInv.calculateDoubleInvestment(parameter);
        double expected = 720_000_000;

        assertEquals(expected,actual,.0001);

    }

    @Test
    @DisplayName("Big")
    void calculateDoubleInvestment_big() {
        Investment testInv = new Investment();
        double parameter = 1000000;
        double actual = testInv.calculateDoubleInvestment(parameter);
        double expected = .00;

        assertEquals(expected,actual,.0001);

    }

    @Test
    @DisplayName("Given Input String Test")
    void printDIResults_GIString() {
        Investment testInv = new Investment();
        double parameter = 4;
        String actual = testInv.printDIResults(parameter);
        String expected = "It will take 18.00 years to double your initial investment.";

        assertEquals(expected,actual);

    }
}