package com.anas;
// 1470. Shuffle the Array

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7}; // {2,3,5,4,1,7}
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        int[] output = new int[nums.length];

        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }

        for (int i = 0; i < nums.length; i++) {
            output[i] = list.get(i);
        }

        return output;


    }
}
