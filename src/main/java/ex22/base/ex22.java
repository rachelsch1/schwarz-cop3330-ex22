package ex22.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if(num1 == num2) {
            return;
        }
        else if(num2 == num3) {
            return;
        }
        else if(num1 == num3) {
            return;
        }

        int largest = 0;

        if(num1 > num2) {
            if(num1 > num3) {
                largest = num1;
            }
            else {
                largest = num3;
            }
        }
        else if(num2 > num3) {
            if(num2 > num1) {
                largest = num2;
            }
            else {
                largest = num1;
            }
        }
        else if(num3 > num1) {
            if(num3 > num2) {
                largest = num3;
            }
            else {
                largest = num2;
            }
        }

        System.out.println("The largest number is " + largest + ".");
    }
}
