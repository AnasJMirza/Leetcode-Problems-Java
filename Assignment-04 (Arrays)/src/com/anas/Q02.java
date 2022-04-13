//1929. Concatenation of Array

package com.anas;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,2};
        System.out.print(Arrays.toString(concat(nums)));

    }

    static int[] concat(int[] nums){
      int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}
