package com.anas;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == - 1){
            return binarySearch(0, nums.length - 1, nums, target);
        } else{
            int firstHalf = binarySearch(0, pivot, nums, target);
            if(firstHalf != -1){
                return firstHalf;
            } else {
                return binarySearch(pivot + 1, nums.length - 1, nums, target);
            }
        }


    }

    static int binarySearch(int start, int end, int[] nums, int target){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            } else if (nums[start] >= nums[mid]){
                end = mid - 1;
            } else if (nums[start] < nums[mid]){
                start = mid + 1;
            }
        }

        return - 1;
    }
}
