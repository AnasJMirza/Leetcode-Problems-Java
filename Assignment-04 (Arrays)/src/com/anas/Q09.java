package com.anas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q09 {
//    1389. Create Target Array in the Given Order
//    Link = https://leetcode.com/problems/create-target-array-in-the-given-order/

//     nums = [0,1,2,3,4], index = [0,1,2,2,1]

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        ArrayList<Integer> a = createTargetArray(nums, index);
        System.out.println(a);
    }


    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }


        Object[] objects = list.toArray();
        return objects;
    }
}
