package com.anas;

// 1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,1,1 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int smallerNumberCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    smallerNumberCount += 1;
                }
            }
            output[i] = smallerNumberCount;
        }

        return output;

    }
}
