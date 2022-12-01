package com.anas;

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        majorityElement(arr);

    }

    static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
