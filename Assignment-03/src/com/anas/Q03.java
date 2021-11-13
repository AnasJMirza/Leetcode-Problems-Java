// Q - 03 : A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to
// find out if he/she is eligible to vote.

package com.anas;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = in.nextInt();

        boolean result = eligibility(age);
        System.out.println(result);
    }

    static boolean eligibility(int age) {
        return (age >= 18);
    }


}
