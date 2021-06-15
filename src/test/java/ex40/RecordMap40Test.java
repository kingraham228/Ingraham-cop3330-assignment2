package ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import ex39.RecordMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecordMap40Test {

    @Test
    @DisplayName("Basic print test")
    void printList_basic() {
        RecordMap40 employees = new RecordMap40();
        employees.fillNameMap();
        employees.fillPositionMap();
        employees.fillSepMap();
        String actual =employees.basicPrintList();
        String expected = "[{Jackson=Jacquelyn, Jacobson=Jake, Johnson=John, Michaelson=Michaela, Webber=Sally, " +
                "Xiong=Tou}, {Jackson=DBA, Jacobson=Programmer, Johnson=Manager, Michaelson=District Manager, " +
                "Webber=Web Developer, Xiong=Software Engineer}, {Jackson=, Jacobson=, Johnson=2016-12-31, " +
                "Michaelson=2015-12-19, Webber=2015-12-18, Xiong=2016-10-05}]";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Formatting Test")
    void formatedPrint() {
        RecordMap40 employees = new RecordMap40();
        employees.fillNameMap();
        employees.fillPositionMap();
        employees.fillSepMap();
        String test = employees.basicPrintList();
        employees.formatedPrint();

        assertNotNull(test);
    }


    @Test
    @DisplayName("Search Tests")
    void searchResults() {
        RecordMap40 employees = new RecordMap40();
        employees.fillNameMap();
        employees.fillPositionMap();
        employees.fillSepMap();
        employees.search("Jac");


    }
}