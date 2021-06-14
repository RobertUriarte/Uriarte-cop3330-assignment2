/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise38;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
public class Exercise38 {
    public static void main(String[] args) {
        String input = get_input();
        ArrayList<String> output = filterEvenNumbers(input);
    }

    public static ArrayList<String> filterEvenNumbers(String input){
        String[] output = input.split(" ");
        int length = output.length;
        ArrayList<String> even = new ArrayList<>();
        System.out.print("The even numbers are");

        int num = 0;
        int x = 0;
        for(int i = 0; i < length; i++){
            num = Integer.parseInt(output[i]);
            if(num % 2 == 0){
                System.out.printf(" %s ",output[i]);
                even.add(x,output[i]);
                x++;
            }

        }
        return even;
    }
    public static String get_input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a list of numbers separated by spaced: ");
        String input = scan.nextLine();
        return input;
    }
}
