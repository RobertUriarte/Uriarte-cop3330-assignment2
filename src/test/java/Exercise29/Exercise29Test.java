/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise29;
import org.testng.annotations.Test;

import static Exercise29.Exercise29.is_rate_valid;
import static org.testng.AssertJUnit.assertFalse;

public class Exercise29Test {
    @Test
    void rate_entered_is_zero() {
        boolean actual = is_rate_valid("0");
        assertFalse(actual);
    }

    @Test
    void rate_entered_are_not_numbers(){
        boolean actual = is_rate_valid("akahdfkaj");
        assertFalse(actual);
    }
}
