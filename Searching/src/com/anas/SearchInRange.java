package com.anas;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {132,23,34,23,12,13,2,3,132};
        int[] range = {0,7};
        int target = 132;
        System.out.println(searchInRange(arr, target, range));
    }

    static boolean searchInRange(int[] arr, int target, int[] range){
        if (arr.length == 0) {
            return false;
        }

        for(int index = range[0]; index <= range[1]; index++){

            if (arr[index] == target){
                return true;
            }
        }

        return false;
    }
}
