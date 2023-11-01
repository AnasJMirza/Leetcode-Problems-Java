package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        int[] arr = { 32,46,56,34,57,32,2,45,46 };
//        int target = 32;
//        boolean result = linearSearch(arr, target);


//        String str = "Hello World";
//        char target = 'H';
//        boolean result = searchString(str, target);

//        int[][] arr = {
//                {1,2,3,4,5,6},
//                {7,8,9},
//                {10,11,12,12,34,16},
//        };
//        boolean result = linearSearch2D(arr, 9);
//        System.out.println("result = " + result);

        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println("result = " + result);


    }

    // search the array and return true if target found else false
    static boolean linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for (int elem: arr) {
            if (elem == target) {
                return true;
            }
        }
        return false;
    }


    // search in Strings and return the true if gets the target else false
    // This will not check if the char is lowercase ot not
    // Lowercase and Uppercase are different in Java
    static  boolean searchString(String str, char target) {
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }



        return false;
    }

    static boolean linearSearch2D(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int elem = arr[i][j];
                if(elem == target) {
                    System.out.println(arr[i][j]);
                    return true;
                }
            }
        }

        return false;
    }

    static int findNumbers(int[] nums) {
        ArrayList<Integer> numbersWithEvenNumberOfDigits = new ArrayList<Integer>(10);
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];
            while (num > 0) {
                num = num / 10;
                count++;
            }
            numbersWithEvenNumberOfDigits.add(count);

        }

        for(int i = 0; i < numbersWithEvenNumberOfDigits.size(); i++) {
            if(numbersWithEvenNumberOfDigits.get(i) % 2 == 0) {
                ans++;
            }
        }

        System.out.println(numbersWithEvenNumberOfDigits);
        return ans;
    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        ArrayList<Integer> wealths = new ArrayList<Integer>(10);
        for(int customer = 0; customer < accounts.length; customer++) {
            int wealth = 0;
            for(int bankAccount = 0; bankAccount < accounts[customer].length; bankAccount++) {
                wealth += accounts[customer][bankAccount];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }

        }

        return maxWealth;
    }
}
