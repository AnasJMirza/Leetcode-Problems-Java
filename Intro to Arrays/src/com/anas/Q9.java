package com.anas;

// 1389. Create Target Array in the Given Order

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> output = new ArrayList<>(nums.length);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = output.get(i);
        }
        return result;

    }

}
