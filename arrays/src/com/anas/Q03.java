package com.anas;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.print(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums){
        int[] runnigSum = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            runnigSum[i] = sum;
        }
        return runnigSum;
    }
}
