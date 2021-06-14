/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise33;

import org.testng.annotations.Test;

import static Exercise33.Exercise33.getAnswer;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise33Test {
    @Test
    void correct_output(){
        int actual = getAnswer();
        int expected = 1;

        assertEquals(actual,expected);
    }
}
