// Q - 03 : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.anas;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        float principal = in.nextFloat();

        System.out.print("Enter time in years : ");
        float time = in.nextFloat();

        System.out.print("Enter rate of interest in % : ");
        float interestRate = in.nextFloat();

//        A = P ( 1 + r * t )

        float simpleInterest = principal * (1 + (interestRate * time));

        System.out.println("Simple interest = " + simpleInterest);

    }
}
