// Q - 07 : To calculate Fibonacci Series up to n numbers.

package com.anas;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nth term of Fibonacci series : ");
        int n = in.nextInt();

        int numone = 1;
        int numtwo = 1;
        int lastvar = 0;
        int newvar = 0;
        System.out.print(numone + " ");
        System.out.print(numtwo + " ");
        for (int i = 2; i < n; i++){

            newvar = numone + numtwo;
            System.out.print(newvar + " ");

            numone = numtwo;
            numtwo = newvar;



        }

    }




}
