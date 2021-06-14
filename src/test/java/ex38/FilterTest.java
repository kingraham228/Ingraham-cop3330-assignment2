package ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    @DisplayName("String to Array Build Test")
    void stringToStringArray_build() {
        Filter test = new Filter();
        String testInput = " 1 2 e 2 9 5 1.2 -1 0 * j foo 33 22 107 -56";
        String [] actual = test.stringToStringArray(testInput);
        String [] expected = {"","1","2","e","2","9","5","1.2","-1","0","*","j","foo","33","22","107","-56"};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected,actual);
    }

    @Test
    @DisplayName("Remove non numbers build test")
    void removeNonNums_build() {
        Filter test = new Filter();
        String testInput = " 1 2 e 2 9 5 1.2 -1 0 * j foo 33 22 107 -56";
        String [] inArray = test.stringToStringArray(testInput);
        System.out.println(Arrays.toString(inArray));
        double [] actual = test.removeNonNums(inArray);
        System.out.println(Arrays.toString(actual));
        double [] expected = {1, 2, 2, 9, 5, 1.2, -1,0, 33, 22, 107, -56};

        assertArrayEquals(expected,actual,.0001);

    }

    @Test
    @DisplayName("Filter build test")
    void filterEvenNumbers_build() {
        Filter test = new Filter();
        String testInput = " 1 2 e 2 9 5 1.2 -1 0 * j foo 33 22 107 -56";
        String [] inArray = test.stringToStringArray(testInput);
        System.out.println(Arrays.toString(inArray));
        double [] pass1 = test.removeNonNums(inArray);
        System.out.println(Arrays.toString(pass1));
        double [] actual = test.filterEvenNumbers(pass1);
        System.out.println(Arrays.toString(actual));
        double [] expected = {2, 2, 0, 22, -56};


        assertArrayEquals(expected,actual,.0001);
    }

}