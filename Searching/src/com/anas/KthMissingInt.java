package com.anas;

public class KthMissingInt {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 10;
        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        if (arr.length == arr[arr.length - 1]) {
            return arr[arr.length - 1] + k;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((arr[mid] - (mid + 1)) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start + k;


    }
}
