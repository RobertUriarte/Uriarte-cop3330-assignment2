/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise37;

import org.testng.annotations.Test;

import static Exercise37.Exercise37.print_password;
import static org.testng.AssertJUnit.assertTrue;

public class Exercise37Test {
    @Test
    void password_length(){
        String password = print_password(8,2,2);
        int actual = password.length();
        int expected = 8;
    }
    @Test
    void amount_of_special(){
        String password = print_password(8,2,2);
        char actual = password.charAt(5);
        boolean val = false;
        if(actual >= '!' || actual <= ')')
            val = true;

        assertTrue(val);
    }
    @Test
    void amount_of_numbers(){
        String password = print_password(8,2,2);
        char actual = password.charAt(7);
        boolean val = false;
        if(actual >= '0' || actual <= '9')
            val = true;

        assertTrue(val);
    }
}
