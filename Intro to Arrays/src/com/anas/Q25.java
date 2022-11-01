package com.anas;

//  566. Reshape the Matrix

import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2},
                {3,4}
        };
        int r = 1, c = 4;
        matrixReshape(mat, r, c);
    }

    static int[][] matrixReshape(int[][] mat, int r, int c){
        if (mat.length * mat[0].length != r * c){
            return mat;
        }

        int[][] ans = new int[r][c];
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));

        }


        int[] newMat = new int[mat.length * mat[0].length];

        int n = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                newMat[n] = mat[i][j];
                n++;
            }
        }

        // printing the newly created array...
        System.out.println(Arrays.toString(newMat));



        int k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = newMat[k];
                k++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));

        }


        return ans;
    }

}
