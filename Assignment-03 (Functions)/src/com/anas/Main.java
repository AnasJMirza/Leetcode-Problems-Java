package com.anas;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int numOne = in.nextInt();
        System.out.println("Enter a number : ");
        int numTwo = in.nextInt();

        System.out.println(sum(numOne, numTwo));


    }


    static int sum(int num1, int num2){

        int result = num1 + num2;
        return result;
    }



}
