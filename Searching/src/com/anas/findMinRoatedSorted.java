package com.anas;

public class findMinRoatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        if (rotationCount(nums) != 0){
            return findInRotatedArray(nums);
        }

        return nums[0];

    }

    static int findInRotatedArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // check case 1 for min
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            // check case 2 for min
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1; //start = mid + 1;
            } else if (nums[start] < nums[mid]) {
                start = mid + 1; //end = mid - 1;
            }
        }

        return -1;
    }

    static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 + 1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            } else if (arr[start] < arr[mid]){
                start = mid + 1;
            }

        }

        return 0;
    }
}
