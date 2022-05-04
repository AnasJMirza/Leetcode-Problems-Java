package com.anas;
//1572. Matrix Diagonal Sum

public class Q15 {
    public static void main(String[] args) {

        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };

        int digonalSum = diagonalSum(mat);
        System.out.println(digonalSum);


    }

    static int diagonalSum(int[][] mat){

        int primaryDigonalSum = 0;
        int seconderyDigonalSum = 0;
        int centerOfMatrix = 0;
        if (mat.length % 2 != 0) {
            centerOfMatrix = mat[mat.length/2][mat.length/2];
        }


        for (int i = 0; i < mat.length; i++) {
            primaryDigonalSum += mat[i][i];
        }

        for (int i = 0; i < mat.length; i++) {
            seconderyDigonalSum += mat[i][mat[i].length - 1 - i];
        }

        int digonalSum = (primaryDigonalSum + seconderyDigonalSum) - centerOfMatrix;


        return digonalSum;
    }
}
