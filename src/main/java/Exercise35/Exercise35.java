/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise35;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise35 {
    public static void main(String[] args) {
        int x = winner();
        int result = person_was_chosen(x);
    }
    public static int winner(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String name = "Hello";
        int length = 0;
        while(!name.equals("")){
            System.out.print("Enter a new name:");
            name = scan.nextLine();
            names.add(name);
            length++;
        }
        Random rand = new Random();
        int random_number = rand.nextInt(length);
        if(names.get(random_number) != null){
            System.out.printf("The winner is... %s", names.get(random_number));
            return random_number;
        }
        return -5;
    }

    public static int person_was_chosen(int number){
        if(number == -5)
            return 0;
        else
            return 1;
    }
}

