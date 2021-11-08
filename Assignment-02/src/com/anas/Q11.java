// Q - 11 : Perfect Number In Java

package com.anas;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        float randomNumber = in.nextInt();
        float n = 3;

        int divisor = 0;

        for (float i = 1; i < randomNumber; i++){

            if (randomNumber % i == 0){
                divisor += i;
            }
        }

        if (randomNumber == divisor){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
