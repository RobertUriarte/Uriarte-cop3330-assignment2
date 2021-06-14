/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise30;

public class Exercise30 {
    public static void main(String[] args){
        int[] table = multiplication_table();
    }
    public static int[] multiplication_table(){
        int[] table = new int[12];
        int j;
        for(int i  = 1; i < 13; i++){
            for(j = 1; j < 13; j++){
                System.out.printf("%4d",i*j);

            }
            System.out.println();
            table[i-1] =(i)*(j-1);
        }
        return table;
    }
}
