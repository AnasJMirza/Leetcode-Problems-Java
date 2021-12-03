// Q - 05 Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:

//  Marks        Grade
//  91-100         AA
//  81-90          AB
//  71-80          BB
//  61-70          BC
//  51-60          CD
//  41-50          DD
//  <=40          Fail

package com.anas;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks out of 100 : ");
        int marks = in.nextInt();

        grades(marks);


    }

    static void grades(int marks){
        if (marks > 90 && marks < 101){
            String grade = "AA";
            System.out.println("Grade = " + grade);
        }

        else if (marks > 80 && marks < 91){
            String grade = "AB";
            System.out.println("Grade = " + grade);
        }

        else if (marks > 70 && marks < 81){
            String grade = "BB";
            System.out.println("Grade = " + grade);
        }

        else if (marks > 60 && marks < 71){
            String grade = "BC";
            System.out.println("Grade = " + grade);
        }

        else if (marks > 50 && marks < 61){
            String grade = "CD";
            System.out.println("Grade = " + grade);
        }

        else if (marks > 40 && marks < 51){
            String grade = "DD";
            System.out.println("Grade = " + grade);
        }

        else if (marks < 40){
            String grade = "Fail";
            System.out.println("Grade = " + grade);
        }

        else{
            System.out.println("Invalid input");
        }


    }
}
