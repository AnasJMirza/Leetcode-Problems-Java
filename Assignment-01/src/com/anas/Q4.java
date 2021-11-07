// Q - 04 : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.anas;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        float numOne = in.nextFloat();

        System.out.print("Enter the second number : ");
        float numtwo = in.nextFloat();

        System.out.print("Enter the operator (+ - * /) : ");
        String ch = in.next();
        char operator = ch.charAt(0);

        if (operator == '+'){
            float result = numOne + numtwo;
            System.out.println("your answer = " + result);
        }
        else if (operator == '-'){
            float result = numOne - numtwo;
            System.out.println("your answer = " + result);
        }
        else if (operator == '*'){
            float result = numOne * numtwo;
            System.out.println("your answer = " + result);
        }
        else if (operator == '/'){
            float result = numOne / numtwo;
            System.out.println("your answer = " + result);
        }
        else
            System.out.println("Invalid Input");
    }
}
