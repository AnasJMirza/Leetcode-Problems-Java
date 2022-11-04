package com.anas;

public class Main {

    public static void main(String[] args) {
//        Linear seach algorithm
        int[] nums = {12, 23, 45, 54, 234, 34, 43, 234};
        int target = 34;
        System.out.println(linearSearch(nums, target));

    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return target;
            }
        }

        return -1;
    }


}
