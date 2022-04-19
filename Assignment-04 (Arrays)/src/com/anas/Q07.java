package com.anas;

import java.util.Arrays;

//  1512. Number of Good Pairs
public class Q07 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums){
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i < j){
                        goodPairs++;
                    }
                }
            }
        }

        return goodPairs;
    }
}
