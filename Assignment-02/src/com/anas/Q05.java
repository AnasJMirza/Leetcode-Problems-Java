// Q - 05 : Factorial Program In Java

package com.anas;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int randomNumber = in.nextInt();

        int factorial = 1;

        for (int i = 1; i <= randomNumber; i++){
            factorial *= i;
        }

        System.out.print("factorial of (" + randomNumber + ") = " + factorial);
    }
}
