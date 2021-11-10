// Check Leap Year Or Not

package com.anas;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year in ( yyyy ) format : ");
        int year = in.nextInt();

        if (year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("This is a leap year");
                }
                else{
                    System.out.println("This is not a leap year");
                }
            }
            else{
                System.out.println("This is a leap year");
            }

        }
        else{
            System.out.println("This is not a leap year.");
        }

    }
}
