// Q - 02 : Take name as input and print a greeting message for that name.

package com.anas;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("hey, enter your name : ");
        String name = in.next();

        System.out.println("Greetings " + name);
    }
}
