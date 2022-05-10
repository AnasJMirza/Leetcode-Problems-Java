package com.anas;
//1295. Find Numbers with Even Number of Digits

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {

        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                even++;
            }
        }

        return even;
    }
}
