/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise36;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static Exercise36.Exercise36.average;
import static Exercise36.Exercise36.std;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise36Test {
    @Test
    void correct_average(){
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(0,"100");
        numbers.add(0,"200");
        numbers.add(0,"1000");
        numbers.add(0,"300");
        int actual = average(numbers);
        int expected = 400;
        assertEquals(actual,expected);
    }

    @Test
    void correct_std(){
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(0,"100");
        numbers.add(0,"200");
        numbers.add(0,"1000");
        numbers.add(0,"300");
        double actual = std(numbers,400);
        double expected = 353.55;
        double delta = 0.5;
        assertEquals(actual,expected,delta);
    }

}
