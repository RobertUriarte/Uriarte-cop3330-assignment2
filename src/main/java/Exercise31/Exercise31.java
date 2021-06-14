/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise31;
import java.util.Scanner;
public class Exercise31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your resting pulse rate: ");
        boolean valid = false;
        String pulse_rate = "";
        while(!valid){ //Keeps asking until user puts in valid pulse rate
            pulse_rate = scan.nextLine();
            valid = is_valid(pulse_rate);
        }

        System.out.print("Enter your age: ");
        valid = false;
        String age = "";
        while(!valid){ //Keeps asking until user puts in valid age
            age = scan.nextLine();
            valid = is_valid(age);
        }
        generate_table(pulse_rate,age);
;    }

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

    public static void generate_table(String pulse_rate, String age){
        System.out.printf("\nPulse Rate: %s            Age: %s\n",pulse_rate,age);
        System.out.println("Intensity        |       Rate");
        System.out.println("-----------------|--------------");
        int pulse_rate2 = Integer.parseInt(pulse_rate);
        int age2 = Integer.parseInt(age);
        for(double i = 55; i <= 95;){
            System.out.printf("%.0f%%              |       %.0f bpm\n",i,bpm_calculator(i,age2,pulse_rate2));
            i += 5;
        }

    }

    public static double bpm_calculator(double intensity, int age, int pulse_rate){
        return ((((220 - age) - pulse_rate) * (intensity/100) + pulse_rate));
    }
}
