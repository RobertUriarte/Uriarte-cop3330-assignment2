/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise27;
import org.testng.annotations.Test;

import static Exercise27.Exercise27.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;


public class Exercise27Test {
    @Test
    void unfilled_first_name(){
        boolean actual = validate_first_name("");
        assertFalse(actual);
    }

    @Test
    void short_first_name(){
        boolean actual = validate_first_name("R");
        assertFalse(actual);
    }
    @Test
    void unfilled_Last_name(){
        boolean actual = validate_last_name("");
        assertFalse(actual);
    }

    @Test
    void short_last_name(){
        boolean actual = validate_last_name("U");
        assertFalse(actual);;
    }

    @Test
    void zipcode_with_something_other_than_numbers(){
        boolean actual = validate_zipcode("3282U");
        assertFalse(actual);
    }

    @Test
    void ID_not_in_correct_format(){
        boolean actual = validate_ID("AFLKJDS");
        assertFalse(actual);
    }
}
