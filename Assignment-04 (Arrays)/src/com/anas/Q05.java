package com.anas;

import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = arr.length / 2;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] shuffle = new int[n*2];
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];

        for (int i = 0; i < n; i++) {
            firstHalf[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            secondHalf[i] = nums[i + n];
        }

        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                shuffle[i] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
            }
            else{
                shuffle[i] = secondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
        }
        return shuffle;
    }
}
