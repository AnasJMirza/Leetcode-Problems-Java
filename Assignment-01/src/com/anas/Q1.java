// Q - 01 : Write a program to print whether a number is even or odd, also take input.

package com.anas;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int randomNum = input.nextInt();

        if (randomNum % 2 == 0){
            System.out.println("The entered number is EVEN.");
        }
        else {
            System.out.println("The entered number is ODD.");
        }

    }
}
