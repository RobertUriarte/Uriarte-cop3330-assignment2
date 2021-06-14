/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise31;

import org.testng.annotations.Test;

import static Exercise31.Exercise31.bpm_calculator;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise31Test {
    @Test
    void example_values(){
        double actual = bpm_calculator(55,22,65);
        double expected = 138;
        double delta = 0.50;

        assertEquals(expected, actual, delta);
    }

    @Test
    void solved_values(){
        double actual = bpm_calculator(90,20,70);
        double expected = 187;
        double delta = 0.50;

        assertEquals(expected, actual, delta);
    }
}
