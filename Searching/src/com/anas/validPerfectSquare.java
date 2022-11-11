package com.anas;

public class validPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }

    static boolean isPerfectSquare(int num) {
        int ans = num;

        while (ans > 0) {

            if (ans * ans == num){
                return true;
            } else {
                ans = ans / 2;
            }

        }

        return false;
    }
}
