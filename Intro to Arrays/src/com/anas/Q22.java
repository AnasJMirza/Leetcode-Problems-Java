package com.anas;

//  https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int n = 6;
        sumZero(n);
    }

    static int[] sumZero(int n) {
        int[] ans = new int[n];

        int a = 1;
        int b = -1;
        if (n % 2 == 0){
            for(int i = 0; i < ans.length; i++){
                if (i % 2 == 0){
                    ans[i] = a;
                    a++;
                }else{
                    ans[i] = b;
                    b--;
                }
            }

        }else{
            ans[0] = 0;
            for(int i = 1; i < ans.length; i++){
                if (i % 2 == 0){
                    ans[i] = a;
                    a++;
                }else{
                    ans[i] = b;
                    b--;
                }
            }
        }

        return ans;
    }
}
