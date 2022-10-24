package com.anas;

// 53. Maximum Subarray

public class Q24 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        maxSubArray(nums);

    }

    static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++){
            if (curSum < 0){
                curSum = 0;
            }

            curSum += nums[i];

            maxSub = Math.max(maxSub, curSum);


        }
        return maxSub;
    }
}
