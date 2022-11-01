package com.anas;
// 66. Plus One

import java.util.Arrays;

public class Q26 {
    public static void main(String[] args) {
        int[] digits = {9,9,9,1};
        plusOne(digits);
    }

    static int[] plusOne(int[] digits) {

        int lastIndex = digits.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] >= 0 && digits[i] <= 8){
                digits[i] += 1;
                break;
            }else{
                digits[i] = 0;
            }
        }



        if (digits[0] == 0){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            System.out.println(Arrays.toString(arr));
            return arr;
        }


        return digits;
    }
}
