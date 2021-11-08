// Q - 08 : Calculate CGPA Java Program

package com.anas;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("how many semester completed : ");
        int semesterCompleted = in.nextInt();

        float cgpa = 0;
        float totalSemester = 0;

        for (int i = 1; i <= semesterCompleted; i++){
            System.out.print("Enter the gpa of (" + i + ") semester : ");
            float gpa = in.nextFloat();
            cgpa += gpa;
            totalSemester = i;
        }

        cgpa = cgpa / totalSemester;
        System.out.print("Your cgpa = " + cgpa);
    }
}
