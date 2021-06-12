package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidatorTest {

    @Test
    @DisplayName("FirstName Given Input")
    void validateFirstName_givenInput() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCDE", "A12-1234");
        int actual = testVal.validateFirstName();
        int expected = 2;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("FirstName empty")
    void validateFirstName_empty() {
        Validator testVal = new Validator();
        testVal.testSetParameters("", "", "ABCDE", "A12-1234");
        int actual = testVal.validateFirstName();
        int expected = 1;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("FirstName correct")
    void validateFirstName_correct() {
        Validator testVal = new Validator();
        testVal.testSetParameters("Jill", "", "ABCDE", "A12-1234");
        int actual = testVal.validateFirstName();
        int expected = 0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("LastName Given Input")
    void validateLastName_givenInput() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCDE", "A12-1234");
        int actual = testVal.validateLastName();
        int expected = 3;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("LastName Short")
    void validateLastName_short() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "I", "ABCDE", "A12-1234");
        int actual = testVal.validateLastName();
        int expected = 4;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("LastName Correct")
    void validateLastName_correct() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "Anderson", "ABCDE", "A12-1234");
        int actual = testVal.validateLastName();
        int expected = 0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Zip Given Input")
    void validateZip_givenInput() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCDE", "A12-1234");
        int actual = testVal.validateZip();
        int expected = 5;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Zip Correct")
    void validateZip_correct() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "32816", "A12-1234");
        int actual = testVal.validateZip();
        int expected = 0;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Zip Weird")
    void validateZip_weird() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "027!-j", "A12-1234");
        int actual = testVal.validateZip();
        int expected = 5;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("EmployeeID Given Input")
    void validateEmployeeID_givenInput() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCDE", "A12-1234");
        int actual = testVal.validateEmployeeID();
        int expected = 6;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("No Hyphen")
    void validateEmployeeID_noHyphen() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCDE", "AB2123");
        int actual = testVal.validateEmployeeID();
        int expected = 6;

        assertEquals(expected, actual, .0001);
    }

    @Test
    @DisplayName("Validation Report Given Correct")
    void printValidationReport_correct() {
        Validator testVal = new Validator();
        testVal.testSetParameters("John", "Johnson", "55555", "TK-4321");
        testVal.validateFirstName();
        testVal.validateLastName();
        testVal.validateZip();
        testVal.validateEmployeeID();
        String actual = testVal.printValidationReport();
        String expected = "There were no errors found.";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Last name empty")
    void printValidationReport_lnEmpty() {
        Validator testVal = new Validator();
        testVal.testSetParameters("John", "", "55555", "TK-4321");
        testVal.validateFirstName();
        testVal.validateLastName();
        testVal.validateZip();
        testVal.validateEmployeeID();
        String actual = testVal.printValidationReport();
        String expected = "The last name must be filled in.\n";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given input incorrect")
    void printValidationReport_incorrect() {
        Validator testVal = new Validator();
        testVal.testSetParameters("J", "", "ABCED","AS-R92!");
        testVal.validateFirstName();
        testVal.validateLastName();
        testVal.validateZip();
        testVal.validateEmployeeID();
        String actual = testVal.printValidationReport();
        String expected = """
                The first name must be at least 2 characters long.
                The last name must be filled in.
                The zipcode must be a 5 digit number.
                The employee ID must be in the format of AA-1234.
                """;

        assertEquals(expected, actual);
    }
}