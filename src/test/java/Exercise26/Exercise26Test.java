/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise26;

import org.testng.annotations.Test;

import static Exercise26.PaymentCalculator.calculateMonthsUntilPaidOff;
import static org.testng.AssertJUnit.assertEquals;


public class Exercise26Test {
    @Test
    void Example_Program_values(){
        double actual = calculateMonthsUntilPaidOff(5000,12,100);
        double expected = 70;

        assertEquals(actual,expected);
    }

    @Test
    void human_self_solved_values(){
        double actual = calculateMonthsUntilPaidOff(2000,10,50);
        double expected = 49;

        assertEquals(actual,expected);
    }
}
