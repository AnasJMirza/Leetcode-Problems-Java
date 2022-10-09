package com.anas;

//  1295. Find Numbers with Even Number of Digits

public class Q16 {

    public static void main(String[] args) {

        int[] nums = {11,21,31,4111,51};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums){
        int count = 0;

        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }

        if (count % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
