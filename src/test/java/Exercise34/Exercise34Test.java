/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise34;

import org.testng.annotations.Test;

import static Exercise34.Exercise34.print_new_names;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise34Test {
    @Test
    void name_not_removed(){
        String[] new_names = {"Mike James", "John Jones", "Lebron James", "Kevin Durant","Tim Clark"};
        int actual = print_new_names(new_names,"John Jones");
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    void name_removed(){
        String[] new_names = {"Mike James", "John Jones"," Lebron James", "Kevin Durant"};
        int actual = print_new_names(new_names,"Time Clark");
        int expected = 0;

        assertEquals(actual,expected);
    }
}
