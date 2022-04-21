package com.anas;
//1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<Integer>(nums.length);
        int[] targetArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            list.add(0);
        }


        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            targetArray[i] = list.get(i);
        }



        return targetArray;
    }
}
