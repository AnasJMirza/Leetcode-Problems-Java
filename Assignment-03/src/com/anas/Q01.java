// Q - 01 : Define two methods to print the maximum and the minimum number respectively among three
// numbers entered by the user.

package com.anas;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int numOne = in.nextInt();

        System.out.print("Enter an integer : ");
        int numTwo = in.nextInt();

        System.out.print("Enter an integer : ");
        int numThree = in.nextInt();

        int maxNumber = findMax(numOne, numTwo, numThree);
        System.out.println("Maximum number between the entered integers = " + maxNumber);

        int minNumber = findMin(numOne, numTwo, numThree);
        System.out.print("Minimum number between the entered integers = " + minNumber);
    }

    static int findMax(int numOne, int numTwo, int numThree){
        return Math.max(numThree, Math.max(numOne,numTwo));
    }

    static int findMin(int numOne, int numTwo, int numThree){
        return Math.min(numOne, Math.min(numTwo,numThree));
    }
}
