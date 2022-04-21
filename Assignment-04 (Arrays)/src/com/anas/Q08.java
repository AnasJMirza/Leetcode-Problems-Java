package com.anas;

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
public class Q08 {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums){
        int[] finalResult = new int[nums.length];

//        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int smallerNumbers = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    smallerNumbers++;
                }
            }
            finalResult[i] = smallerNumbers;
        }

        return finalResult;
    }
}
