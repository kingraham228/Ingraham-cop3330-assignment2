package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Initialization Test")
    void initializeEmployeeList() {
        Employee test = new Employee();
        test.initializeEmployeeList();
        test.printEmployeeList();
    }


    @Test
    @DisplayName("Employee removal First")
    void removeEmployee_first() {
        Employee test = new Employee();
        test.initializeEmployeeList();
        test.printEmployeeList();
        String employeeTest = "John Smith";
        test.removeEmployee(employeeTest);
        test.printEmployeeList();
        int acutal = test.getEmployeeCount();
        int expected = 4;

        assertEquals(expected,acutal);
    }

    @Test
    @DisplayName("Employee removal Mid")
    void removeEmployee_mid() {
        Employee test = new Employee();
        test.initializeEmployeeList();
        test.printEmployeeList();
        String employeeTest = "Chris Jones";
        test.removeEmployee(employeeTest);
        test.printEmployeeList();
        int acutal = test.getEmployeeCount();
        int expected = 4;

        assertEquals(expected,acutal);
    }

    @Test
    @DisplayName("Employee removal Last")
    void removeEmployee_last() {
        Employee test = new Employee();
        test.initializeEmployeeList();
        test.printEmployeeList();
        String employeeTest = "Jeremy Goodwin";
        test.removeEmployee(employeeTest);
        test.printEmployeeList();
        int acutal = test.getEmployeeCount();
        int expected = 4;

        assertEquals(expected,acutal);
    }
}