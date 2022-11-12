package com.anas;

import java.util.Arrays;

public class strictlyOrderMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(matrix, 9)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // edge case
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        // perform binarySearch on middle col of the matrix
        // explain: run the loop till 2 rows are remaining
        while (rowStart < (rowEnd - 1)) { // while this is true there are more then two rows...
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            } else if (matrix[mid][colMid] > target) {
                rowEnd = mid;
            } else {
                rowStart = mid;
            }
        }



        // after exiting from the loop, we will have only two rows.
        // check weather target is in the col of 2 remaining rows or not?
        if (matrix[rowStart][colMid] == target) { // checking in the first row middle col
            return new int[]{rowStart, colMid};
        }

        if (matrix[rowStart + 1][colMid] == target) { // checking in the second row middle col
            return new int[]{rowStart + 1, colMid};
        }

        // search in the 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }

        // search in the 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }

        // search in the 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        } else { // search in the 4th half
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }

    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {

        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }


        return new int[]{-1,-1};
    }




}
