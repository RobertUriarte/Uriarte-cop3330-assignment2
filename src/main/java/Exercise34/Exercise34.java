/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise34;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = create_names();
        System.out.println("\nThere are 5 employees");
        for(int i = 0; i < 5; i++){
            System.out.println(names[i]);
        }
        System.out.print("Please enter a name to remove: ");
        String name_to_remove = scan.nextLine();
        String[] new_names = remove_name(name_to_remove,names);
        int x = print_new_names(new_names,name_to_remove);
    }

    public static String[] create_names(){
        return new String[]{"John Smith", "Mike James", "Sarah Jones", "Tim Brooks", "Sandra Martinez"};
    }

    public static String[] remove_name(String name_to_remove,String[] names){
        String[] new_names = {"","","",""};
        int x = 0;
        for(int i = 0; i < 4; i++){
            if(names[i].equals(name_to_remove)){
                x++;
            }
            new_names[i] = names[x];
            x++;
        }
        return new_names;
    }

    public static int print_new_names(String[] new_names,String name_to_remove){
        int x = 0;
        System.out.println("\nThere are 4 employees");
        for(int i = 0; i < 4; i++){
            System.out.println(new_names[i]);
            if(name_to_remove.equals(new_names[i]))
                x = 1;
        }
        return x;
    }
}
