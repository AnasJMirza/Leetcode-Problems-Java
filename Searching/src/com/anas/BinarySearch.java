package com.anas;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,9,12,15,45,57,89,100};
        int[] arr2 = {100, 90,80,45,34,32,22,11,5,2,1};
        int target = 1;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearchReverse(arr2, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }else if  (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearchReverse(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }else if  (arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
