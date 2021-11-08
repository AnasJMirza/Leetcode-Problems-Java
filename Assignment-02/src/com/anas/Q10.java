// Q - 10 : Find if a number is palindrome or not

package com.anas;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a integer number : ");
        int randomNumber = in.nextInt();

        int rem = 0;
        int reverse = 0;
        int orignalnumber = randomNumber;


        while (randomNumber != 0){
            rem = randomNumber % 10;
            reverse = reverse * 10 + rem;
            randomNumber = randomNumber / 10;
        }

        System.out.println("oringla number = " + orignalnumber);
        System.out.println("reverse number = " + reverse);

        if (orignalnumber == reverse){
            System.out.println("its a palindrome number");
        }
        else{
            System.out.println("its not a palindrome number");
        }
    }
}
