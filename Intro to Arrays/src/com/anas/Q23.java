package com.anas;

//  https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q23 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };

        luckyNumbers(matrix);
    }

    static List<Integer> luckyNumbers (int[][] matrix){


        List<Integer> ans = new ArrayList<Integer>(5);



        for (int i = 0; i < matrix.length; i++) {
            int min = 999999999;
            int minIndex = 0;
//            loop for getting the minimum number in a row...
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            
//            loop for checking if the number is greater then all in its coloumn or not...
            boolean flag = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][minIndex] < matrix[j][minIndex]){
                    flag = false;
                    break;
                }
            }

            if (flag == true){
                ans.add(matrix[i][minIndex]);
            }
            
        }

        System.out.println(ans);

        return ans;


    }
}
