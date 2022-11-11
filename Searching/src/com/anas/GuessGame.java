//package com.anas;
///**
// * Forward declaration of guess API.
// * @param  num   your guess
// * @return 	     -1 if num is higher than the picked number
// *			      1 if num is lower than the picked number
// *               otherwise return 0
// * int guess(int num);
// */
//public class GuessGame {
//    public static void main(String[] args) {
//
//    }
//
//    public int guessNumber(int n) {
//        int start = 1;
//        int end = n;
//
//        while (start <= end) {
//            int ans = start + (end - start) / 2;
//            if (guess(ans) == 0) {
//                return ans;
//            }
//            if (guess(ans) == -1){
//                end = ans - 1;
//            }
//            if (guess(ans) == 1){
//                start = ans + 1;
//            }
//        }
//
//        return -1;
//    }
//}
