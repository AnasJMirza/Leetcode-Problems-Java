package com.anas;

public class SortArrayParity {
    public static void main(String[] args) {

    }


    static int[] sortArrayByParity(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }

        return nums;
    }

}
