/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise33;

import java.util.Random;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args){
        System.out.print("What is your question?\n>");
        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();
        int val = getAnswer();
    }

    public static int getAnswer(){
        Random rand = new Random();
        int random_number = rand.nextInt(4);
        int[] answer_array  = {1,2,3,4};
        switch (answer_array[random_number]) {
            case 1 -> {
                System.out.print("Yes");
                return 1;
            }
            case 2 -> {
                System.out.print("No");
                return 1;
            }
            case 3 -> {
                System.out.print("Maybe");
                return 1;
            }
            case 4 -> {
                System.out.print("Ask again, later");
                return 1;
            }
        }
        return 0;
    }
}
