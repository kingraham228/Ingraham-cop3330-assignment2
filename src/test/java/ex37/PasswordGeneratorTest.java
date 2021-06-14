package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    @DisplayName("Length Calc Build Test")
    void getPassFinalLength_build() {
        PasswordGenerator test = new PasswordGenerator();
        int minl = 8;
        int sc = 2;
        int nn = 2;
        int acutal = test.getPassFinalLength(minl,sc,nn);
        int expected = 8;

        assertEquals(expected,acutal);
    }

    @Test
    @DisplayName("Length Calc Increase Test")
    void getPassFinalLength_increase() {
        PasswordGenerator test = new PasswordGenerator();
        int minl = 8;
        int sc = 6;
        int nn = 4;
        int acutal = test.getPassFinalLength(minl,sc,nn);
        int expected = 20;

        assertEquals(expected,acutal);
    }

    @Test
    @DisplayName("Length Calc Small Test")
    void getPassFinalLength_small() {
        PasswordGenerator test = new PasswordGenerator();
        int minl = 8;
        int sc = 1;
        int nn = 1;
        int acutal = test.getPassFinalLength(minl,sc,nn);
        int expected = 8;

        assertEquals(expected,acutal);
    }
    @Test
    @DisplayName("Letter Number Test")
    void getPassFinalLength_letterTest() {
        PasswordGenerator test = new PasswordGenerator();
        int minl = 8;
        int sc = 6;
        int nn = 4;
        test.getPassFinalLength(minl,sc,nn);
        int actual = test.getNumLetters();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Build Array Build Test")
    void buildPArray_build() {
        PasswordGenerator test = new PasswordGenerator();
        int minl = 8;
        int sc = 2;
        int nn = 2;
        int flength = test.getPassFinalLength(minl,sc,nn);
        int let = test.getNumLetters();
        String[] testPW = test.buildPArray(flength,let,sc,nn);
        System.out.println(Arrays.toString(testPW));
        int actual = test.getNumLetters();
        int expected = 4;

        assertEquals(expected,actual);
    }
}