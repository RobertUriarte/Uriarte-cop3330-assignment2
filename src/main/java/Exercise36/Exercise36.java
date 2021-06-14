/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise36;

import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {

        ArrayList<String> numbers = get_numbers();
        int average = average(numbers);
        int min = min(numbers);
        int max = max(numbers);
        double std = std(numbers,average);
        print_results(numbers,average,min,max,std);
    }
    public static void print_results(ArrayList<String> numbers, int average, int max, int min, double std){
        int length = numbers.size();
        System.out.print("Numbers: ");
        for (String number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.printf("\nThe average is %d\n", average);
        System.out.printf("The minimum is %d\n", min);
        System.out.printf("The maximum is %d\n", max);
        System.out.printf("The standard deviation is %.2f\n", std);
    }
    public static ArrayList<String> get_numbers(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        String input = "";
        while(!input.equals("done")){
            System.out.print("Enter a number: ");
            input = scan.nextLine();
            if(!input.equals("done"))
                numbers.add(input);
        }
        return numbers;
    }
    public static double std(ArrayList<String> numbers, int average){
        int length = numbers.size();
        String input = "";
        int num;
        double standard_deviation = 0;
        for (String number : numbers) {
            input = number;
            num = Integer.parseInt(input);
            standard_deviation += Math.pow(num - average, 2);
        }
        return Math.sqrt(standard_deviation/length);
    }
    public static int average(ArrayList<String> numbers){
        int length = numbers.size();
        int sum = 0;
        String get_number_from_string = "";
        int num;
        for (int i = 0; i < length; i++) {
            get_number_from_string = numbers.get(i);
            num = Integer.parseInt(get_number_from_string);
            sum += num;
        }
        return sum/length;
    }
    public static int max(ArrayList<String> numbers){
        int length = numbers.size();
        String string1 = "";
        int num1,num2;
        String string2 = "";
        for(int i = 0; i < length; i++ ){
            for(int j = i+1; j < length; j++){ //Sorts array in order to find max value
                string1 = numbers.get(i);
                string2 = numbers.get(j);
                num1 = Integer.parseInt(string1);
                num2 = Integer.parseInt(string2);
                if(num1 > num2){
                    string1 = numbers.get(i);
                    numbers.set(i,numbers.get(j)) ;
                    numbers.set(j,string1);
                }
            }
        }
        string1 = numbers.get(length-1);
        return Integer.parseInt(string1);
    }
    public static int min(ArrayList<String> numbers){
        int length = numbers.size();
        String string1 = "";
        int num1,num2;
        String string2 = "";
        for(int i = 0; i < length; i++ ){
            for(int j = i+1; j < length; j++){ //Sorts array in order to find min value
                string1 = numbers.get(i);
                string2 = numbers.get(j);
                num1 = Integer.parseInt(string1);
                num2 = Integer.parseInt(string2);
                if(num1 > num2){
                    string1 = numbers.get(i);
                    numbers.set(i,numbers.get(j)) ;
                    numbers.set(j,string1);
                }
            }
        }
        string1 = numbers.get(0);
        return Integer.parseInt(string1);
    }

}
