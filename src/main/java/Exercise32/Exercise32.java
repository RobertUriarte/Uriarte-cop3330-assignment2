/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise32;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String answer = "Y";
        while (answer.equals("Y")){
            number_game_prompt();
            System.out.println("\nDo you want to play again enter capital Y  to continue, any other key to exit.");
            answer = scan.nextLine();
        }

    }
    public static void number_game_prompt(){
        System.out.println("Lets play a number game!");
        System.out.println("Enter level of difficulty (1,2,3): ");
        Scanner scan = new Scanner(System.in);
        String difficulty = "";
        boolean valid = false;
        while(!valid){ //Keeps asking until user enters valid number
            difficulty = scan.nextLine();
            valid = is_valid(difficulty);
        }
        number_game(difficulty);
    }
    public static void number_game(String difficulty){
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 0;
        double random_number = 0;
        switch (difficulty) { //Generates random number based on difficulty chosen
            case "1" -> {
                max = 10;
                random_number = Math.floor(Math.random() * (max - min + 1) + min);
            }
            //System.out.printf("%f",random_number);
            case "2" -> {
                max = 100;
                random_number = Math.floor(Math.random() * (max - min + 1) + min);
            }
            case "3" -> {
                max = 1000;
                random_number = Math.floor(Math.random() * (max - min + 1) + min);
            }
        }

        System.out.print("I have my number. What is your guess? ");
        String guess = "";
        boolean valid = false;
        int num_of_guesses = 0;
        while(!valid){ //User keeps entering number until they guess correctly, keeps track of guesses
            guess = scan.nextLine();
            valid = is_guess_correct(guess,random_number);
            num_of_guesses++;
        }
        System.out.printf("You got it! It took you %d guesses", num_of_guesses);
    }

    public static boolean is_guess_correct(String number, double random_number){
        int length = number.length();
        for(int i = 0; i < length; i++){
            if(number.charAt(i) < '0' || number.charAt(i) > '9'){
                System.out.print("Error invalid input, please try again: ");
                return false;
            }
        }
        double guess = Integer.parseInt(number);
        if(guess < random_number){
            System.out.println("Too low. Try again:");
            return false;
        }

        else if(guess > random_number){
            System.out.println("Too high. Try again:");
            return false;
        }


        return true;
    }
    public static boolean is_valid(String number){
        int length = number.length();
        for(int i = 0; i < length; i++){
            if(number.charAt(i) < '0' || number.charAt(i) > '9'){
                System.out.print("Error invalid input, please try again: ");
                return false;
            }
        }
        return true;
    }

}
