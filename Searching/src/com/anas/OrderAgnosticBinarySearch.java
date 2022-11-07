package com.anas;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {1,1,1,1,1,1,1,1,1,1};
        System.out.println(orderAgnosticBinarySearch(arr, 1));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[0] < arr[arr.length - 1]){
                if (target > arr[mid]){
                    start = mid + 1;
                }else if (target < arr[mid]){
                    end = end - 1;
                }else{
                    return mid;
                }
            }else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else if (target < arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
        }

        return -1;
    }
}
