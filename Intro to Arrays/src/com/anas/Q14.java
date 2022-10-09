package com.anas;

// 1252. Cells with Odd Values in a Matrix

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[][] indices = {{1,1}, {0,0}};
        int m = 2;
        int n = 2;

        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];
        int ans = 0;

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][indices[i][1]]++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}
