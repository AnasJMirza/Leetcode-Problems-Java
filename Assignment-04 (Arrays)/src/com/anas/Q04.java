package com.anas;

import java.util.Arrays;

public class Q04 {
//    1672. Richest Customer Wealth
//    Link = https://leetcode.com/problems/richest-customer-wealth/

    public static void main(String[] args) {
        int[][] accounts = {{1, 5, 13}, {100, 1}};
        System.out.println(maximumWealth(accounts));


    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > max){
                max = sum;
            }
        }

        return max;
    }
}