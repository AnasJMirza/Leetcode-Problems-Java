package com.anas;

public class SeachMin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,331,123},
                {23,234,32,234},
                {234,234,23,4},
                {234,3,43,31}
        };

        System.out.println(min(arr));

    }

    static int min(int[][] arr){
        int min = arr[0][0];
        for (int index = 0; index < arr.length; index++) {
            for (int j = 0; j < arr[index].length; j++) {
                if (arr[index][j] < min){
                    min = arr[index][j];
                }
            }
        }
        return min;
    }
}
