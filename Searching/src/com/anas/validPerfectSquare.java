package com.anas;

public class validPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }


    static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sqrt = mid * mid;
            if (sqrt == num) {
                return true;
            } else if (sqrt > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
