package com.anas;

import java.util.Arrays;

class Q01 {
    public static void main(String[] args) {
//        1920. Build Array from Permutation (LEETCODE QUESTION)
//        Link = https://leetcode.com/problems/build-array-from-permutation/

        int[] arr = {0,2,1,5,3,4};
        int[] a = buildArray(arr);
        System.out.println(Arrays.toString(a));

    }

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
