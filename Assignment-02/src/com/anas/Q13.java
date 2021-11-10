// Q - 13 : Write a program to print the sum of negative numbers, sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when
// the user enters a zero.

package com.anas;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int list = in.nextInt();
        int negetiveSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        while(list != 0){


            if(list < 0){
                negetiveSum += list;
            }
            else if(list > 0 && list % 2 == 0){
                positiveEvenSum += list;
            }
            else if (list > 0 && list % 2 != 0){
                positiveOddSum += list;
            }

            System.out.print("Enter an integer : ");
            list = in.nextInt();
        }

        System.out.println("sum of negetive numbers = " + negetiveSum);
        System.out.println("sum of ODD positive numbers = " + positiveOddSum);
        System.out.println("sum of EVEN positive numbers = " + positiveEvenSum);
    }
}
