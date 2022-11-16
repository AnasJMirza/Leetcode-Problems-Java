package com.anas;

import java.util.Arrays;

public class findDuplicateNumber {
    public static void main(String[] args) {

    }

    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;


    }
}
