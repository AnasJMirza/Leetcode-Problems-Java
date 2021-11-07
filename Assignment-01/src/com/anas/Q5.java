// Q - 05 : Take 2 numbers as input and print the largest number.

package com.anas;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float numone = in.nextFloat();

        System.out.print("Enter second number : ");
        float numtwo = in.nextFloat();

        if (numone > numtwo){
            System.out.println("first number is largest");
        }
        else if (numone < numtwo){
            System.out.println("second number is largest");
        }
        else {
            System.out.println("both numbers are same");
        }

    }
}
