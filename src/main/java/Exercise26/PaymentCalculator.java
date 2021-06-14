/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Robert Uriarte
 */
package Exercise26;
import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        System.out.print("What is your balance: ");
        Scanner scan = new Scanner(System.in);
        double balance = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthly_payment = scan.nextDouble();
        double x = calculateMonthsUntilPaidOff(balance,APR,monthly_payment);
        System.out.printf("It will take you %.1f months to pay off your card",x);
    }

    public static double calculateMonthsUntilPaidOff(double balance, double APR, double monthly_payment) {
        APR /= 36500;
        double months = (-1/30.0) * (Math.log(1 + (balance/monthly_payment) * (1 - Math.pow((1 + APR),30))) / Math.log(1 + APR));
        return Math.ceil(months);
    }
}

