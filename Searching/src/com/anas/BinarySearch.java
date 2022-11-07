package com.anas;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,9,12,15,45,57,89,100};
        int target = 15;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        for (int index = 0; index < arr.length / 2; index++) {
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }else if  (arr[mid] < target){
                start += mid;
            }else{
                end -= mid;
            }
        }

        return -1;
    }
}
