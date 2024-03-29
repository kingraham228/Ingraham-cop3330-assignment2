package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    @DisplayName("Building Test")
    void calculateHeartRate() {
        HeartRate test = new HeartRate();
        String actual = test.calculateHeartRate(22,65,.55);
        String expected = "138";

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Range test high")
    void calculateHeartRate_hightest() {
        HeartRate test = new HeartRate();
        String actual = test.calculateHeartRate(98,107,.55);
        String expected = "115";

        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Range test low")
    void calculateHeartRate_lowtest() {
        HeartRate test = new HeartRate();
        String actual = test.calculateHeartRate(.7,.001,.55);
        String expected = "121";

        assertEquals(expected,actual);

    }


}