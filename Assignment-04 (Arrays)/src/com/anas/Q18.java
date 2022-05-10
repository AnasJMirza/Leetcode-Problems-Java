package com.anas;
//989. Add to Array-Form of Integer

import java.util.*;


public class Q18 {
   public static void main(String[] args) {

        int[] num = {1,2,0,0};
        int k = 34;

       System.out.println(addToArrayForm(num, k));

    }

    static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> sol = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0){
            if (i >= 0) {
                sol.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
                i--;
            }else {
                sol.add(k % 10);
                k = k / 10;
            }
        }

        Collections.reverse(sol);

        return sol;

    }
}
