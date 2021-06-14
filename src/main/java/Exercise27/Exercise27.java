/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise27;
import java.util.Scanner;
public class Exercise27 {
    public static void main(String[] args){
        System.out.print("Please enter a first name: ");
        Scanner scan = new Scanner(System.in);
        String first_name = scan.nextLine();
        System.out.print("Please enter a last name: ");
        String last_name = scan.nextLine();
        System.out.print("Please enter a zip code: ");
        String zipcode = scan.nextLine();
        System.out.printf("Please enter an employee ID in the format AA-1234: ");
        String ID = scan.nextLine();
        validate_inputs(first_name,last_name,zipcode,ID);
    }

    public static void validate_inputs(String first_name, String last_name, String zipcode, String ID){
        boolean val1 = validate_first_name(first_name);
        boolean val2 = validate_last_name(last_name);
        boolean val3 = validate_zipcode(zipcode);
        boolean val4 = validate_ID(ID);

        if(val1 && val2 && val3 && val4)
            System.out.print("There are no errors detected");
    }

    public static boolean validate_first_name(String first_name){
        if(first_name.length() == 0) {
            System.out.println("Error first Name is not filled");
            return false;
        }
        else if(first_name.length() < 2) {
            System.out.println("Error first name is too short");
            return false;
        }
        else
            return true;
    }

    public static boolean validate_last_name(String last_name){
        if(last_name.length() == 0) {
            System.out.println("Error last Name is not filled");
            return false;
        }
        else if(last_name.length() < 2) {
            System.out.println("Error last name is too short");
            return false;
        }
        else
            return true;
    }

    public static boolean validate_zipcode(String zipcode){
        int length = zipcode.length();
        for(int i = 0; i < length; i++){
            if(zipcode.charAt(i) < '0' || zipcode.charAt(i) > '9'){
                System.out.println("The zipcode is invalid");
                return false;
            }
        }
        return true;
    }

    public static boolean validate_ID(String ID){
        int length = ID.length();
        if(length != 7){
            System.out.println("The ID is not the correct length");
            return false;
        }

        for(int i = 0; i < 2; i++){
            if(ID.charAt(i) < 'A' || ID.charAt(i) > 'Z'){
                System.out.println("The employee ID letters are incorrect");
                return false;
            }

        }
        if(ID.charAt(2) != '-'){
            System.out.println("Incorrect ID format");
            return false;
        }

        for(int j = 3; j < length; j++){
            if(ID.charAt(j) < '0' || ID.charAt(j) > '9'){
                System.out.println("The employee ID number are incorrect");
                return false;
            }

        }
        return true;
    }
}
