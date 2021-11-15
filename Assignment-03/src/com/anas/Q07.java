// Q - 07 : Write a function that returns all prime numbers between two given numbers.

package com.anas;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = in.nextInt();

        System.out.print("Enter last number : ");
        int lastNumber = in.nextInt();

        allPrime(firstNumber, lastNumber);
    }

    static void allPrime(int firstNumber, int lastNumber){
        for (int i = firstNumber; i <= lastNumber; i++){
            boolean flag = false;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = true;
                    break;
                }
            }

            if (flag == false){
                System.out.print(i + " ");
            }


        }
    }
}
