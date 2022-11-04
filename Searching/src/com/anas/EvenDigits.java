package com.anas;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (String.valueOf(nums[index]).length() % 2 == 0){
                count++;
            }
        }
            return count;
    }
}
