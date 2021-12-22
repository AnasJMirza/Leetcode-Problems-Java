package com.anas;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {
//        1929. Concatenation of Array (LEETCODE QUESTION)
//        Link = https://leetcode.com/problems/concatenation-of-array/

        int[] arr = {1, 2, 1};
        System.out.println("Before Concatenation : " + Arrays.toString(arr));
        System.out.println("After Concatenation" + Arrays.toString(getConcatenation(arr)));
    }



        static int[] getConcatenation(int[] nums) {
            int n = nums.length;

            int[] ans = new int[n * 2];

            for (int i = 0; i < n; i++){
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }

            return ans;
        }



}


