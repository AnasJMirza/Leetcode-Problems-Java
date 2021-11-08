// Q - 02 : Input a number and print all the factors of that number (use loops).

package com.anas;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int randomNumber = in.nextInt();

        System.out.print("all the factorials of " + randomNumber + " = ");

        for (int i = 1; i <= randomNumber; i++){
            if (randomNumber % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
