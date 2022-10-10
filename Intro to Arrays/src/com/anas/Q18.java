package com.anas;

// https://leetcode.com/problems/add-to-array-form-of-integer/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {

        int[] num = {9,9,8};
        int k = 1;
        addToArrayForm(num, k);

    }

    static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<Integer>();
        int index = num.length - 1;
        while(index >= 0 || k > 0){
            if(index >= 0){
                ans.add((num[index] + k) % 10);
                k = (num[index] + k) / 10;
                index--;
            }else{
                ans.add(k % 10);
                k /= 10;
            }
        }

        Collections.reverse(ans);
        System.out.println(ans);
        return ans;

    }
}
