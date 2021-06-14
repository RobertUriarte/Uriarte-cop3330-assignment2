/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        int min = minimum_length();
        int special = special_character(min);
        int number = the_numbers(min);
        String password = print_password(min,special,number);
        System.out.print(password);
    }
    public static String print_password(int min, int special, int number){
        Random rand = new Random();
        int random_number = rand.nextInt(10);
        int random_number2 = rand.nextInt(26);
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        char[] special_characters = {'!','@','#','$','%','^','&','*','(',')'};
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','x','y','z'};
        char[] password = new char[min];

        for(int i = 0; i < (min - special - number); i++){
            password[i] = letters[random_number2];
            random_number2 = rand.nextInt(25);
        }

        for(int i = (min-special-number + 1); i < min -number; i++){
            password[i] = special_characters[random_number];
            random_number = rand.nextInt(10);
        }
        for(int i = min-special; i < min; i++){
            password[i] = numbers[random_number];
            random_number = rand.nextInt(10);
        }
        String the_password = new String(password);
        return the_password;
    }
    public static int special_character(int minimum_length){
        Scanner scan = new Scanner(System.in);
        int val = 100000000;
        while(val > (minimum_length/4)){ //Only allows 1/4 of the password to be special characters
            System.out.println("Please enter the number of special characters");
            val = scan.nextInt();
            if(val > (minimum_length/4))
                System.out.println("You can't have this many special characters based on your min length, please try again with less special characters:");
        }
        return val;
    }
    public static int the_numbers(int minimum_length){
        Scanner scan = new Scanner(System.in);
        int val = 100000000;
        while(val > (minimum_length/4)){ //only allows 1/4 of the password to be numbers
            System.out.println("Please enter the number of numbers?");
            val = scan.nextInt();
            if(val > minimum_length/4)
                System.out.println("You can't have this many numbers based on your min length, please try again with less special characters");
        }
        return val;
    }
    public static int minimum_length(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the minimum length of the password: ");
        int min = scan.nextInt();
        return min;
    }
}
