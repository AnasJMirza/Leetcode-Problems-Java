package com.anas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	    int[] arr = new int[5];

        System.out.print("Enter elements : ");
        for (int i = 0; i < 5; i++){
            arr[i] = in.nextInt();
        }

            System.out.println(arr.toString(arr));

    }


}
