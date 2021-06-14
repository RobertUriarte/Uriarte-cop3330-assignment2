/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise38;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static Exercise38.Exercise38.filterEvenNumbers;
import static org.testng.AssertJUnit.assertEquals;


public class Exercise38Test {
    @Test
    void gets_even(){
        ArrayList<String> actual = filterEvenNumbers("1 2 3 4 5 6 7 8 9 10");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        expected.add("4");
        expected.add("6");
        expected.add("8");
        expected.add("10");

        assertEquals(actual,expected);
    }

    @Test
    void gets_even_only_one_even_number(){
        ArrayList<String> actual = filterEvenNumbers("1 3 4 5 7 9");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("4");
        assertEquals(actual,expected);
    }

    @Test
    void gets_even_only_one_number(){
        ArrayList<String> actual = filterEvenNumbers("2");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2");
        assertEquals(actual,expected);
    }
}
