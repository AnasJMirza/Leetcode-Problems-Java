// Q - 14 : BMI Calculator

package com.anas;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in (KGS) : ");
        float weight = in.nextFloat();

        System.out.println("Press (F) to enter height in feet");
        System.out.println("Press (M) to enter height in meters");
        System.out.println("Press (I) to enter height in inches");
        char ch = in.next().trim().charAt(0);

        switch (ch) {
            case 'F', 'f' -> {
                System.out.print("Enter height : ");
                float height = in.nextFloat();
                double heightMeter = height / 3.24;
                double BMI = weight / (Math.pow(heightMeter, 2));
                System.out.println("Your BMI = " + BMI);
            }

            case 'M','m' -> {
                System.out.print("Enter height : ");
                float height = in.nextFloat();
                double BMI = weight / (Math.pow(height, 2));
                System.out.println("Your BMI = " + BMI);
            }

            case 'I','i' -> {
                System.out.print("Enter height : ");
                float height = in.nextFloat();
                double heightMeter = height / 39.37;
                double BMI = weight / (Math.pow(heightMeter, 2));
                System.out.println("Your BMI = " + BMI);
            }

            default -> {
                System.out.println("Invalid Input");
            }
        }



    }
}
