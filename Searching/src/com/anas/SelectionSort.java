package com.anas;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]   arr = {5,42,43,52,71,0,-12,-21321,12,24214, 2,3,3,3,3,3,5,5,5,5,6,6,6,6,6,6};
//        System.out.println(findMax(arr, arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = findMax(arr, arr.length - 1 - i);
            // put the maximum to the right index...
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int findMax(int[] arr, int length){
        int maxIndex = 0;
        for (int i = 0; i <= length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
