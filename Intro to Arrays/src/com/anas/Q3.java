package com.anas;
// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
