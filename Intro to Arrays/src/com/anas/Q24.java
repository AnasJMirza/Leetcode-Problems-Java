package com.anas;

// 53. Maximum Subarray

public class Q24 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        maxSubArray(nums);
    }

    static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum = sum + nums[j];
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);

        return 1;
    }
}
