/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise28;

import org.testng.annotations.Test;

import static Exercise28.Exercise28.total_calculator_test;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise28Test {
    @Test
    void a_total(){
        int[] num_array = {1,2,3,4,5};
        int actual = total_calculator_test(num_array);
        int expected = 15;

        assertEquals(actual,expected);
    }
}
