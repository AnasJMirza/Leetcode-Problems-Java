package com.anas;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }

    static void sortColors(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));


    }
}
