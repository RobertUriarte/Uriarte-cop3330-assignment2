/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise32;

import org.testng.annotations.Test;
import static Exercise32.Exercise32.*;
import static Exercise31.Exercise31.is_valid;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Exercise32 {
    @Test
    void is_valid_correct_string(){
        boolean actual = is_valid("31");
        assertTrue(actual);
    }

    @Test
    void is_valid_incorrect_string(){
        boolean actual = is_valid("hello");
        assertFalse(actual);
    }
}
