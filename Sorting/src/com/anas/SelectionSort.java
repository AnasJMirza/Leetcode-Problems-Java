package com.anas;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
	    int[] arr = {5, -1, 0, 0, -2, -2, 3, 3, 45};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    replace(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    static void replace(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
