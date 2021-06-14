/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise25;
import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args){
        System.out.print("Please enter a password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        int password_strength = passwordValidator(password);
        switch(password_strength){
            case 1 -> System.out.print("Your password is very weak");
            case 2 -> System.out.print("Your password is  weak");
            case 3 -> System.out.print("Your password is strong");
            case 4 -> System.out.print("Your password is very strong");
        }
    }

    public static int passwordValidator(String password){
        int length = password.length();
        int x = 0;
        for(int i = 0; i < length; i++){ //Tests if password only contains numbers
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
                x++;
        }
        if(x == length || length < 8)
            return 1;


        x = 0;
        for(int i = 0; i < length; i++){ //Tests if password only contains characters
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
                x++;
        }
        if(x == length || length < 8)
            return 2;


        x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < length; i++){ // Tests if password has numbers, characters, and special characters
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                x++;
            }
            else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                y++;
            }
            else{
                z++;
            }
        }
        if(length >= 8 && x > 0 && y > 0 && z == 0)
            return 3;
        else
            return 4;
    }
}
