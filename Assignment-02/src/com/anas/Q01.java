// Remember I have started doing the questions by Q - 22 so, counting starts from here.
// Q - 22 : Subtract the Product and Sum of Digits of an Integer

package com.anas;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int randomNumber =  in.nextInt();

        int rem = 0;
        int product = 1;
        int sum = 0;

        while (randomNumber > 0){
             rem = randomNumber % 10;
             product *= rem;
             sum += rem;
             randomNumber /= 10;
        }

        int result = product - sum;
        System.out.println("Final answer is = " + result);
    }
}
