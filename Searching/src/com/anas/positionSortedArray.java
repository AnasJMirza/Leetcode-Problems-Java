package com.anas;

public class positionSortedArray {
    public static void main(String[] args) {

    }


    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = searchIndex(nums, target, true);
        ans[1] = searchIndex(nums, target, false);

        return ans;


    }

    int searchIndex(int[] nums, int target, boolean isStartIndex){

        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == nums[mid]){

                index = mid;
                if (!isStartIndex){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            }else if (target > nums[mid]){

                start = mid + 1;

            }else{

                end = mid - 1;

            }

        }

        return index;
    }
}
