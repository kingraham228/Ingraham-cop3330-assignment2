package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {


    @Test
    @DisplayName("Basic lowercase test")
    void getPrintResult_test1() {
        Anagram testAna = new Anagram();
        String testWord1 = "toast";
        String testWord2 = "toast";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Basic capitalization test")
    void isAnagram_test2() {
        Anagram testAna = new Anagram();
        String testWord1 = "Toast";
        String testWord2 = "toaSt";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Basic not anagram test")
    void isAnagram_test3() {
        Anagram testAna = new Anagram();
        String testWord1 = "Toast";
        String testWord2 = "jslef";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are not anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Basic length test")
    void isAnagram_test4() {
        Anagram testAna = new Anagram();
        String testWord1 = "Toast";
        String testWord2 = "jslefse";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "These strings are not the same length.\n"+"\""+testWord1+"\" and \""+testWord2+"\" are not anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Similar length test")
    void isAnagram_test5() {
        Anagram testAna = new Anagram();
        String testWord1 = "Toast";
        String testWord2 = "Toasty";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "These strings are not the same length.\n"+"\""+testWord1+"\" and \""+testWord2+"\" are not anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Number Test Anagram")
    void isAnagram_test6() {
        Anagram testAna = new Anagram();
        String testWord1 = "lkd252";
        String testWord2 = "252lkd";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Number Test Not Anagram")
    void isAnagram_test7() {
        Anagram testAna = new Anagram();
        String testWord1 = "OIj9274";
        String testWord2 = "jow46m2";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are not anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Number Length Test Not Anagram")
    void isAnagram_test8() {
        Anagram testAna = new Anagram();
        String testWord1 = "8675309top";
        String testWord2 = "pot86753092";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "These strings are not the same length.\n"+"\""+testWord1+"\" and \""+testWord2+"\" are not anagrams.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Weird Character Tests")
    void isAnagram_test9() {
        Anagram testAna = new Anagram();
        String testWord1 = "K-92775!";
        String testWord2 = "k-9!5772";
        testAna.testSetWords(testWord1, testWord2);
        boolean test = testAna.isAnagram(testAna.getWords());
        String actual = testAna.getPrintResult(test);
        String expected = "\""+testWord1+"\" and \""+testWord2+"\" are anagrams.";

        assertEquals(expected, actual);

    }
}