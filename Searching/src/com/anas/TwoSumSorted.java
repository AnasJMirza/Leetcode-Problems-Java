package com.anas;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[]{-1,-1};
    }
}
