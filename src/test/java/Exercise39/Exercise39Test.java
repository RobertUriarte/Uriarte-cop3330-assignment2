/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise39;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static Exercise39.Exercise39.create_list_of_maps;
import static Exercise39.Exercise39.print_employees;
import static org.testng.AssertJUnit.assertEquals;


public class Exercise39Test {
    @Test
    void correct_name_one(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,0);
        String expected = "Jacquelyn";

        assertEquals(actual,expected);
    }

    @Test
    void correct_name_two(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,1);
        String expected = "Jake";

        assertEquals(actual,expected);
    }

    @Test
    void correct_name_three(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,2);
        String expected = "John";

        assertEquals(actual,expected);
    }

    @Test
    void correct_name_four(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,3);
        String expected = "Michaela";

        assertEquals(actual,expected);
    }
    @Test
    void correct_name_five(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,4);
        String expected = "Sally";

        assertEquals(actual,expected);
    }
    @Test
    void correct_name_six(){
        List<Map<String, String>> employeeList = create_list_of_maps();
        String actual = print_employees(employeeList,5);
        String expected = "Tou";

        assertEquals(actual,expected);
    }
}
