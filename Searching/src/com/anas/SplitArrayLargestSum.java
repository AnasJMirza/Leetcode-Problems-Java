package com.anas;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // assigning min value to start and max value to end.
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // actual algorithm.
        while (start < end) {
            int mid = start + (end - start) / 2; // potential ans.

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you can not add new value to the subarray.
                    // make a new one
                    sum = num;
                    pieces ++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;

    }
}
