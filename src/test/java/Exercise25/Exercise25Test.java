/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise25;

import org.testng.annotations.Test;

import static Exercise25.Exercise25.passwordValidator;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise25Test {
    @Test
    void password_is_short_with_numbers_and_letters(){
        int actual = passwordValidator("hi20");
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    void password_has_only_numbers(){
        int actual = passwordValidator("23874234234234");
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    void password_has_only_characters() {
        int actual = passwordValidator("hellomynameisrobby");
        int expected = 2;

        assertEquals(actual,expected);
    }

    @Test
    void password_has_letters_and_numbers_and_is_long(){
        int actual = passwordValidator("Hellomynameisrobby2021");
        int expected = 3;

        assertEquals(actual,expected);
    }

    @Test
    void password_has_special_characters_numbers_and_characters_and_is_long(){
        int actual = passwordValidator("Hellomynameisrobby2021^&*");
        int expected = 4;

        assertEquals(actual,expected);
    }

    @Test
    void password_has_uppercase_letters_only() {
        int actual = passwordValidator("HELLOMYNAMEISROBBY");
        int expected = 2;

        assertEquals(actual,expected);
    }

}
