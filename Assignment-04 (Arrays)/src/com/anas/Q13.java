package com.anas;
//832. Flipping an Image

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] finalAnswer = flipAndInvertImage(image);
        for (int i = 0; i < finalAnswer.length; i++) {
            System.out.println(Arrays.toString(finalAnswer[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            int s = 0;
            int e = image.length - 1;

            int[] arr = image[i];
            while (s < e){
                int temp;
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
