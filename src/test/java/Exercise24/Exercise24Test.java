/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise24;

import org.testng.annotations.Test;

import static Exercise24.Exercise24.isAnagram;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Exercise24Test {
    @Test
    void both_strings_are_anagrams(){
        boolean actual = isAnagram("note","tone");

        assertTrue(actual);
    }

    @Test
    void both_string_are_not_anagrams() {
        boolean actual = isAnagram("dogs", "cats");

        assertFalse(actual);
    }

    @Test
    void both_strings_are_the_same_string(){
        boolean actual = isAnagram("dogs","dogs");

        assertTrue(actual);
    }
}
