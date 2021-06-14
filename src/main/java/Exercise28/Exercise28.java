/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise28;
import java.util.Scanner;
public class Exercise28 {
    public static void main(String[] args){
        int total = total_calculator();
        System.out.printf("The total is %d",total);
    }
    public static int total_calculator(){
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Please Enter a number: ");
            total += scan.nextInt();
        }
        return total;
    }
    public static int total_calculator_test(int[] num_array){ //Method created to test functionality of for loop
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Please Enter a number: ");
            total += num_array[i];
        }
        return total;
    }
}
