package com.anas;

import java.util.Arrays;

public class SquareSortedArr977 {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        // covert every element to its square.
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // sort it in non-dec order
        Arrays.sort(nums);
        return nums;
    }
}
