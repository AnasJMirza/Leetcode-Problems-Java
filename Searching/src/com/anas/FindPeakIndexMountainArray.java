package com.anas;

public class FindPeakIndexMountainArray {
    public static void main(String[] args) {

    }


    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
