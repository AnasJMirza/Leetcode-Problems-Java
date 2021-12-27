package com.anas;

public class Q12 {
//    1732. Find the Highest Altitude (LEETCODE QUESTION)
//    Link = https://leetcode.com/problems/find-the-highest-altitude/
//    Input: gain = [-5,1,5,0,-7]

    public static void main(String[] args) {
//        int[] arr = {-5, 1, 5, 0, -7};
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }


    static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current = current + gain[i];
            if (current > max){
                max = current;
            }
        }

        return max;
    }
}
