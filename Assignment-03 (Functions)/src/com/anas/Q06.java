// Q - 06 : Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.

package com.anas;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int randomNumber = in.nextInt();

        int result = factorial(randomNumber);
        System.out.println("factorial of the number is = " + result);
    }

    static int factorial(int randomNumber) {
        int factorial = 1;
        for (int i = 1; i <= randomNumber; i++){
            factorial *= i;
        }

        return factorial;
    }
}
