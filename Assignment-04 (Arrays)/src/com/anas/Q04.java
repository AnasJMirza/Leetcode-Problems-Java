package com.anas;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(maximumWealth(accounts));
        
    }

    static int maximumWealth(int[][] accounts){
        int richestCostumer = 0;
        int wealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            if (richestCostumer < wealth){
                richestCostumer = wealth;
            }
            wealth = 0;
        }
        return richestCostumer;
    }
}
