package com.anas;

import java.util.Arrays;

public class MaxProduct628 {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3};
        maximumProduct(arr);
    }

    static int maximumProduct(int[] nums) {
        // array to store three numbers
        int[] arr = new int[3];

        // create the start and end pointers
        int start = 0;
        int end = nums.length - 1;

        // start the loop and check by comapring both sides which one is bigger
        int i = 0;
        while (start <= end) {
            if (nums[start]*-1 > nums[end]) {
                arr[i] = nums[start];
                start++;
                i++;
            } else {
                arr[i] = nums[end];
                end--;
                i++;
            }

            // if the array is filled with maximums, break the loop
            if (i == 3) {
                break;
            }
        }



        return arr[0] * arr[1] * arr[2];
    }
}
