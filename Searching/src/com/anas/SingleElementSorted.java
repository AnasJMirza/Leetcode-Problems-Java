package com.anas;

public class SingleElementSorted {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,88,88,100,100,140,150,150,190,190};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length < 2) {
            return nums[0];
        }

        // boundry checks
        if (nums[start] < nums[start + 1] ) {
            return nums[start];
        }

        if (nums[end] > nums[end - 1]) {
            return nums[end];
        }

        // actual algorithm (binary search approach)
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check mid as a potential answer
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
