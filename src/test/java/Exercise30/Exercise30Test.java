/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise30;

import org.testng.annotations.Test;

import static Exercise30.Exercise30.multiplication_table;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise30Test{
    @Test
    void correct_numbers(){
        int[] actual = new int[12];
        actual = multiplication_table();
        int[] expected = new int[]{12,24,36,48,60,72,84,96,108,120,132,144};


        assertEquals(actual[0],expected[0]);
    }

    @Test
    void correct_numbers2(){
        int[] actual = new int[12];
        actual = multiplication_table();
        int[] expected = new int[]{12,24,36,48,60,72,84,96,108,120,132,144};


        assertEquals(actual[1],expected[1]);
    }

    @Test
    void correct_numbers3(){
        int[] actual = new int[12];
        actual = multiplication_table();
        int[] expected = new int[]{12,24,36,48,60,72,84,96,108,120,132,144};


        assertEquals(actual[11],expected[11]);
    }
}
