package com.anas;

// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
