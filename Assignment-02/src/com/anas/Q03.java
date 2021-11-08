// Q - 03 : Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.anas;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int randomNumber = in.nextInt();

        int sum = 0;

            System.out.print("Enter an integer : ");
            int randomNumber = in.nextInt();

            while (randomNumber != 0){
                sum = sum + randomNumber;
                System.out.print("Enter an integer : ");
                randomNumber = in.nextInt();
            }

            if (randomNumber == 0){
                System.out.println("Sum of all numbers = " + sum);
            }
    }
}
