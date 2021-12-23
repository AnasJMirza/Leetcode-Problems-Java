package com.anas;

import java.util.Arrays;

public class Q03 {
//    1480. Running Sum of 1d Array (LEETCODE QUESTION)
//    Link = https://leetcode.com/problems/running-sum-of-1d-array/

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Orignal Arrays : " + Arrays.toString(nums));
        System.out.println("Running sum of Array : " + Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }

        return nums;
    }

}


