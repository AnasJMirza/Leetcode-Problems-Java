// Q - Some basic practice to understand arrays in Java.

package com.anas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax (One dimensional arrays)

//        System.out.print("Enter the size of the array : ");
//        int arraySize = in.nextInt();
//
//        int[] arr = new int[arraySize];
//
//        System.out.print("Enter elements to array : ");
//
//        for (int i = 0; i < arraySize; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

        // syntax (Two dimensional arrays)

//        System.out.print("Enter the values of the arrays : ");

//        int[][] arr = new int[3][3];
//
//        for (int i = 0; i < 3; i++){
//
//            for (int j = 0; j < 3; j++){
//                arr[i][j] = in.nextInt();
//            }
//
//        }
//
//        System.out.print(Arrays.deepToString(arr));

        int[][] arr = new int[3][3];
        System.out.println(arr.length);


        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        for (int row = 0; row < arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));
        }

    }


}
