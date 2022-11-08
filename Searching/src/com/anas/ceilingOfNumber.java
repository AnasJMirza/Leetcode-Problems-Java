package com.anas;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,8,9,12,15,45,57,89,100};
        System.out.println(ceiling(arr, 90));
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (target == arr[mid]){
                return arr[mid];
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if (start > arr.length - 1){
            return -1;
        }

        return arr[start];
    }
}
