package com.anas;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class Q6 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> output = new ArrayList<Boolean>(candies.length);

        for (int i = 0; i < candies.length; i++) {
            int max = candies[i] + extraCandies;
            boolean flag = false;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]){
                    output.add(i, false);
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                output.add(i, true);
            }
        }
        return output;
    }
}
