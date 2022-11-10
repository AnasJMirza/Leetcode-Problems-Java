package com.anas;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 + 1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            } else if (arr[start] < arr[mid]){
                start = mid + 1;
            }

        }

        return 0;
    }


}
