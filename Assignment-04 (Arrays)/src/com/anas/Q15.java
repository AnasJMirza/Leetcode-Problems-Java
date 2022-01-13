package com.anas;

public class Q15 {
//    1572. Matrix Diagonal Sum
//    Link = https://leetcode.com/problems/matrix-diagonal-sum/

    public static void main(String[] args) {
        int[][] arr = {
                        {4,6,7},
                        {2,9,4},
                        {5,5,5}
                                };

        System.out.println(diagonalSum(arr));

    }

    static int diagonalSum(int[][] mat) {
        int primarySum = 0;
        int secendorySum = 0;

        for (int i = 0; i < mat.length; i++) {
            primarySum += mat[i][i];
        }
        if (mat.length % 2 == 0){
            for (int i = 0; i < mat.length; i++) {
                secendorySum += mat[i][mat.length - 1 - i];
            }
        }
        else{

            for (int i = 0; i < mat.length; i++) {
                if (i != mat.length / 2) {
                    secendorySum += mat[i][mat.length - 1 - i];
                }

            }
        }

        int sum = primarySum + secendorySum;
        return sum;
    }
}
