package com.anas;

// 1572. Matrix Diagonal Sum

public class Q15 {
    public static void main(String[] args) {
        int[][] mat = {
                {5}

        };

        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat){
        int firstSum = 0;
        int secondSum = 0;
        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            firstSum += mat[i][i];
            secondSum += mat[i][mat.length - 1 - i];
        }

        ans = firstSum + secondSum;

        if (mat.length % 2 != 0){
            ans -= mat[mat.length / 2][mat.length / 2];
        }


        return ans;
    }
}
