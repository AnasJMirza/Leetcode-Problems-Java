// Q - 07 : Calculate Electricity Bill

package com.anas;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many units you have consumed : ");
        int units = in.nextInt();

        int bill = 0;

        if (units > 300){
            bill = units * 18;
        }
        else {
            bill = units * 14;
        }

        System.out.println("your bill = " + bill);
    }
}
