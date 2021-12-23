package com.anas;

import java.util.Scanner;

public class Q07 {
//    1512. Number of Good Pairs (LEETCODE QUeSTION)
//    Link = https://leetcode.com/problems/number-of-good-pairs/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }


}
