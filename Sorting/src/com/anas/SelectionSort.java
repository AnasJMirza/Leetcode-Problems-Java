package com.anas;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, -3, -4, 0, 0, 3, 3, -34, -34, 34, 45};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = getMaxIndex(arr, 0, arr.length - 1 - i);
            // replace maxIndex element with the respective last index.
            replace(arr, maxIndex, arr.length - 1 - i);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[i + 1]) {
                max = i + 1;
            }
        }
        return max;
    }

    static void replace(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
