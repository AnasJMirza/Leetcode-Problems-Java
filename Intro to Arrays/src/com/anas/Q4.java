package com.anas;

// 1672. Richest Customer Wealth;

public class Q4 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,13}, {4,5,6}, {1,2,3,3,4,5,6,10}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int richestCustomerWelth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (richestCustomerWelth < sum) {
                richestCustomerWelth = sum;
            }
        }
        return richestCustomerWelth;
    }
}
