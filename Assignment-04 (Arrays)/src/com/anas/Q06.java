package com.anas;


import java.util.ArrayList;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {
        int[] candies= {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> result = new ArrayList<Boolean>(5);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = candies[i] + extraCandies;
            boolean flag = false;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]) {
                    result.add(false);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                result.add(true);
            }
        }
        return result;
    }
}
