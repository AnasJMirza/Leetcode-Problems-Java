package com.anas;

import java.util.Arrays;

public class Q13 {
//    832. Flipping an Image
//    Link = https://leetcode.com/problems/flipping-an-image/

    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};

        int[][] arr = flipAndInvertImage(image);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }




    }




    static int[][] flipAndInvertImage(int[][] image) {
//        rervese the  array using swap method

        for (int i = 0; i < image.length; i++) {
            swap(image[i]);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }


        return image;
    }

    static void swap(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            ++s;
            --e;

        }
    }

    
}