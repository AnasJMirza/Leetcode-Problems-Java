// Q - 04 : Define a method to find out if a number is prime or not.

package com.anas;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = in.nextInt();

        boolean result =  isPrime(number);
        System.out.println(result);
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
