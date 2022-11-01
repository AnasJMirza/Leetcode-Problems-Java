package com.anas;

// 26. Remove Duplicates from Sorted Array

import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,3,3,3};
        removeDuplicates(nums);
    }

    static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                nums[k] = nums[i + 1];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(k);

        return k;
    }

}
