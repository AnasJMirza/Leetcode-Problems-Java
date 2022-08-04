package com.anas;

import java.util.Arrays;

//	1920. Build Array from Permutation
public class Main {

    public static void main(String[] args) {
        int nums[] = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}


