package com.anas;

import java.util.Arrays;

public class Q05 {
//    1470. Shuffle the Array (LEETCODE QUESTION)
//    Link = https://leetcode.com/problems/shuffle-the-array/

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));

    }

//    static int[] shuffle(int[] nums, int n) {
//        int[] arr = new int[n * 2];
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                arr[i] = nums[k];
//            }
//            else {
//                arr[i] = nums[n + k];
//                k++;
//            }
//        }
//        return arr;
//    }

    static int[] shuffle(int[] nums, int n) {
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];
        int[] shuffleArr = new int[n * 2];

        for (int i = 0; i < n; i++) {
            firstHalf[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            secondHalf[i] = nums[n + i];
        }
        int k = 0;
        for (int i = 0; i < shuffleArr.length; i++) {
            if (i % 2 == 0){
                shuffleArr[i] = firstHalf[k];
            }
            else {
                shuffleArr[i] = secondHalf[k];
                k++;
            }
        }
        return shuffleArr;
    }
}
