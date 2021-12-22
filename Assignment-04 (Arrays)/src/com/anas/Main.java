// Q - Some basic practice to understand arrays in Java.

package com.anas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      One dimensional Arrays

//        String[] arrName = new String[5];
//
//        for (int i = 0; i < arrName.length; i++) {
//            arrName[i] = in.nextLine();
//        }
//
//        System.out.println(Arrays.toString(arrName));
//        change(arrName);
//        System.out.println(Arrays.toString(arrName));


//        Two Dimensional Arrays

//        int[][] arr = new int[3][3];
//
//        for (int row = 0; row < arr.length; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }


//        for (int row = 0; row < arr.length; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int[] ints : arr) {
//
//            System.out.println(Arrays.toString(ints));
//
//        }


//        System.out.println(Arrays.toString(twoDArray));


//        Array List

//        ArrayList<Integer> nam = new ArrayList<Integer>(5);
//
//        nam.add(8239);
//        nam.add(89324);
//        nam.add(89324);
//        nam.add(8349);
//        nam.add(82349);
//        nam.add(83249);
//
//        System.out.println(nam);
//
//        nam.set(1, 4);
//
//        System.out.println(nam);
//
//        nam.add(2, 4);
//
//        System.out.println(nam);
//
//        System.out.println(nam.indexOf(89324));
//
//        Multi-dimensional Arraylist

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
////        initilization
//
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//
////        Adding elements
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Add 5 elements in Arrays list : ");
//            for (int j = 0; j < 5; j++) {
//                list.get(i).add(in.nextInt());
//            }
//        }
//
//        System.out.println(list);
//
//

//        swaping numbers in Arrays

//        int[] arr = {1,2,3,4,5};
//        swap(arr, 1, 2);
//        System.out.println(Arrays.toString(arr));

//        find Max of an array

        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverseArr(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e){
            swap(arr, s, e);
            s = s + 1;
            e = e - 1;
        }
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}