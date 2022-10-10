package com.anas;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

import java.util.Arrays;

public class Q20 {
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };

        findRotation(mat, target);





    }

    static boolean findRotation(int[][] mat, int[][] target){
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)){
                System.out.println("It matches at " + i + " rotate");
                return true;
            }else{
                rotate(mat);
            }

        }

        return false;
    }

     static boolean check(int[][] mat, int[][] target) {
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat[i].length; j++) {
                 if (mat[i][j] != target[i][j]){
                     return false;
                 }
             }
         }
         return true;
    }

    static int[][] rotate(int[][] mat) {
//        taking transpose
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < i; j++) {
                 int temp = mat[i][j];
                 mat[i][j] = mat[j][i];
                 mat[j][i] = temp;
             }
         }


//        reversing the internal arrays
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat[i].length / 2; j++) {
                 int temp = mat[i][j];
                 mat[i][j] = mat[i][mat[i].length - 1 - j];
                 mat[i][mat[i].length - 1 - j] = temp;
             }
         }

         return mat;
    }
}
