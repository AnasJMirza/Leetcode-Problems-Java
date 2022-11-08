package com.anas;

public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]){
            return letters[0];
        }

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return letters[start];
    }
}
