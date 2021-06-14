package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatsPackTest {

    @Test
    @DisplayName("Building Test")
    void average_building() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 100.0);
        testList.add(1, 200.0);
        testList.add(2, 1000.0);
        testList.add(3, 300.0);
        double actual = testStats.average(testList);
        double expected = 400.0;

        assertEquals(expected, actual, .0001);

    }

    @Test
    @DisplayName("Tiny numbers")
    void average_tiny() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, .005);
        testList.add(1, .00001);
        testList.add(2, .00026);
        testList.add(3, .004);
        double actual = testStats.average(testList);
        double expected = .0023175;

        assertEquals(expected, actual, .0001);

    }

    @Test
    @DisplayName("Big numbers")
    void average_Big() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 4_008.00);
        testList.add(1, 750_000.00);
        testList.add(2, 1_000_000.0);
        testList.add(3, 9_853_661.0);
        double actual = testStats.average(testList);
        double expected = 2_901_917.25;

        assertEquals(expected, actual, .0001);

    }

    @Test
    @DisplayName("Empty array")
    void average_empty() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        double actual = testStats.average(testList);
        double expected = 0;

        assertEquals(expected, actual, .0001);

    }

    @Test
    @DisplayName("Min Build Test")
    void min_build() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 200.0);
        testList.add(1, 1000.0);
        testList.add(2, 100.0);
        testList.add(3, 300.0);
        double actual = testStats.min(testList);
        double expected = 100.0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Max Build Test")
    void max_build() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 200.0);
        testList.add(1, 1000.0);
        testList.add(2, 100.0);
        testList.add(3, 300.0);
        double actual = testStats.max(testList);
        double expected = 1000.0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Max Last Spot Test")
    void max_lastspot() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 200.0);
        testList.add(1, 300.0);
        testList.add(2, 100.0);
        testList.add(3, 1000.0);
        double actual = testStats.max(testList);
        double expected = 1000.0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("STD buid test")
    void std() {
        StatsPack testStats = new StatsPack();
        ArrayList<Double> testList = new ArrayList<>();
        testList.add(0, 200.0);
        testList.add(1, 300.0);
        testList.add(2, 100.0);
        testList.add(3, 1000.0);
        double actual = testStats.std(testList);
        double expected = 353.55;

        assertEquals(expected, actual, .005);
    }
}