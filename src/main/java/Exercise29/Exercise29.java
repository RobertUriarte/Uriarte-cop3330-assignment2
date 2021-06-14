/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise29;
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args){
        System.out.print("What is the rate of return: ");
        Scanner scan = new Scanner(System.in);
        String rate = scan.nextLine();

        while(!is_rate_valid(rate)){
            System.out.print("What is the rate of return: ");
            rate = scan.nextLine();
        }

    }
    public static boolean is_rate_valid(String rate){
        int length = rate.length();
        if(rate.charAt(0) == '0'){
            System.out.println("Zero is not an acceptable number, please try again");
            return false;
        }
        for(int i  = 0; i < length; i++){
            if(rate.charAt(i) < '1' || rate.charAt(i) > '9'){
                System.out.println("Invalid input");
                return false;
            }
        }
        int rate2 = Integer.parseInt(rate);
        System.out.printf("It will take %d years to double your initial investment", (72/rate2));
        return true;
    }

}
