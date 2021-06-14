/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise24;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Exercise24 {
    //Gets two strings and determines if they are anagrams.
    public static void main(String[] args){
        System.out.print("Enter two string and I will tell you if they are anagrams: \nEnter first string: ");
        Scanner scan = new Scanner(System.in);
        String  first = scan.nextLine();
        System.out.print("Enter the second string: ");
        String second = scan.nextLine();

        if(isAnagram(first,second))
            System.out.printf("\"%s\" and \"%s\" are anagrams",first,second);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams",first,second);
    }

    static boolean isAnagram(String first, String second){
       //Gets lengths of both strings to determine if they anagrams
        int length1 = first.length();
        int length2 = second.length();

        if(length1 != length2)
            return false;

        //Turns strings into char arrays to sort them.
        char[] first_string = first.toCharArray();
        char[] second_string = second.toCharArray();

        Arrays.sort(first_string);
        Arrays.sort(second_string);

        for(int i = 0; i < length1; i++){
            if(first_string[i] != second_string[i])
                return false;
        }

        return true;
    }
}
