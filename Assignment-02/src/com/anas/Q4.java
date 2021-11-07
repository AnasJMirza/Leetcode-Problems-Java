// Q -04 : Take integer inputs till the user enters 0 and print the largest number from all.

package com.anas;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int randomNumber = in.nextInt();

        int max = 0;
        max = randomNumber;

        while (randomNumber != 0){
            System.out.print("Enter an integer : ");
            randomNumber = in.nextInt();
            if (max > randomNumber){
                max = max;
            }
            else{
                max = randomNumber;
            }
        }

        System.out.print("Max number = " + max);
    }
}
