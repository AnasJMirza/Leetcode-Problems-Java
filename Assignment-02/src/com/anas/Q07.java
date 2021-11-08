// Q - 07 : Calculate Average Of N Numbers

package com.anas;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many values you want to enter : ");
        float size = in.nextInt();

        float sum = 0;
        float avg = 0;

        for (int i = 1; i <= size; i++){
            System.out.print("Enter an integer : ");
            int randomNumber = in.nextInt();

            sum += randomNumber;
        }

        avg = sum / size;
        System.out.println("Average of all numbers = " + avg);
    }
}
