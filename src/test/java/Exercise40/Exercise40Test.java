/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise40;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static Exercise40.Exercise40.create_list_of_maps;
import static Exercise40.Exercise40.print_strings;
import static org.testng.AssertJUnit.assertEquals;

public class Exercise40Test {
    @Test
    void example_test(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String[] myStrings = print_strings("Jac",employeeList);

        String actual = myStrings[0];
        String expected = "Jacquelyn";

        assertEquals(actual,expected);
    }

    @Test
    void example_test2(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String[] myStrings = print_strings("Jac",employeeList);

        String actual = myStrings[1];
        String expected = "Jake";

        assertEquals(actual,expected);
    }
}
