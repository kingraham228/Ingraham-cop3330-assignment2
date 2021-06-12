package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    @DisplayName("very weak output test")
    void printValidation_test1() {
        Password userPassword = new Password();
        userPassword.testSetPassword("12345");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a very weak password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("very weak output test with white space")
    void printValidation_test1a() {
        Password userPassword = new Password();
        userPassword.testSetPassword("1234 5 64136 456");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a very weak password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("weak output test")
    void printValidation_test2() {
        Password userPassword = new Password();
        userPassword.testSetPassword("abcdef");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a weak password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("weak output test with caps and white space ")
    void printValidation_test2a() {
        Password userPassword = new Password();
        userPassword.testSetPassword("abcdef DJLAI NBIE SLIEN");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a weak password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("strong output test")
    void printValidation_test3() {
        Password userPassword = new Password();
        userPassword.testSetPassword("abc123xyz");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a strong password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("strong output test with caps and whitespace")
    void printValidation_test3a() {
        Password userPassword = new Password();
        userPassword.testSetPassword("abc123xyz DKLAI 1049092834 ");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a strong password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("very strong output test")
    void printValidation_test4() {
        Password userPassword = new Password();
        userPassword.testSetPassword("1337h@xor!");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a very strong password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("very strong output test with white space and caps")
    void printValidation_test4a() {
        Password userPassword = new Password();
        userPassword.testSetPassword("1337h@xor! ) sklkj &*# @");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a very strong password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("edge case: 8 characters but no numbers")
    void printValidation_test5() {
        Password userPassword = new Password();
        userPassword.testSetPassword("abclsedf");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a weak password.";

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("edge case: lots of characters but no numbers but a special character")
    void printValidation_test6() {
        Password userPassword = new Password();
        userPassword.testSetPassword("Alkj eils ##$");
        String myPassword = userPassword.getPassword();
        String actual = userPassword.printValidation(userPassword.passwordValidator(myPassword));
        String expected = "The password '"+myPassword+"' is a weak password.";

        assertEquals(expected,actual);
    }
}