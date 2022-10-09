package com.anas;

// 832. Flipping an Image

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q13 {

    public static void main(String[] args) {
        int[][] image = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        flipAndInvertImage(image);


    }

    static int[][] flipAndInvertImage(int[][] image){
//        reversing the internal arrays...
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp;
                temp = image[i][j];
                image[i][j] = image[i][image.length - 1 - j];
                image[i][image.length - 1 - j] = temp;
            }
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }

//        Inversing the internal Arrays

//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image.length; j++) {
//                if (image[i][j] == 0){
//                    image[i][j] = 1;
//                }else{
//                    image[i][j] = 0;
//                }
//            }
//        }



        return image;
    }
}
