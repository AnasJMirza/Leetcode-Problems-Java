// Q - 02 : Define a program to find out whether a given number is even or odd.

package com.anas;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :  ");
        int number = in.nextInt();

        checkEvenOdd(number);
    }

    static void checkEvenOdd(int number){
        if (number % 2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}

