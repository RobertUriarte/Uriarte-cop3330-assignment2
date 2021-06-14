/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise35;

import org.testng.annotations.Test;

import static Exercise35.Exercise35.person_was_chosen;
import static Exercise35.Exercise35.winner;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise35Test {
    @Test
    void winner_works(){
        int actual = person_was_chosen(10);
        int expected = 1;

        assertEquals(actual,expected);
    }
}
