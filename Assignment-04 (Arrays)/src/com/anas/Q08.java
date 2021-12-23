package com.anas;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
//    1365. How Many Numbers Are Smaller Than the Current Number (LEETCODE QUESTION)
//    Link = https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements in array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }


    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    count += 1;
                }
            }

            result[i] = count;
        }
        return result;
    }
}
