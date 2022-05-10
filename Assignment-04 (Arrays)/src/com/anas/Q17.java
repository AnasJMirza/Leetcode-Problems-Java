package com.anas;
// Transpose Matrix

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
//                {7,8,9}
        };

        int[][] transposeOfMatrix = transpose(matrix);

        for (int i = 0; i < transposeOfMatrix.length; i++) {
            System.out.println(Arrays.toString(transposeOfMatrix[i]));
        }
    }

    static int[][] transpose(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeOfMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeOfMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeOfMatrix;

    }
}
