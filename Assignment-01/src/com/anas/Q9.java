// Q - 09 : To find Armstrong Number between two given numbers.

package com.anas;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int numone = in.nextInt();

        System.out.print("Enter second number : ");
        int numtwo = in.nextInt();

        for (int i = numone; i <= numtwo; i++){

            numone = i;

            int rem = 0;
            int cube = 0;
            int sum = 0;

            while (numone != 0){

                rem = numone % 10;
                cube = (rem * rem * rem);
                sum = sum + cube;

                numone = numone / 10;

            }

            if (sum == i){
                System.out.println(i + " is an armstrong number");
            }
        }


    }
}
