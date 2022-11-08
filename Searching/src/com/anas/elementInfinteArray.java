package com.anas;

public class elementInfinteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,435,556,768,546456};
        int target = 170;
        System.out.println(findElement(arr, target));
    }

    static int findElement(int[] arr, int target){
        int start = 0;
        int end = 1;

        // checking in chunks

        while (target > arr[end]){
            // update the start value
            int temp = end + 1; // new start value
            // double the boxvalue
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            } else if (target > arr[mid]){
                start = mid  + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
