package com.anas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {
//        candies = [2,3,5,1,3], extraCandies = 3

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }


    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max = 0;

        for (int j : candies) {
            max = Math.max(j, max);
        }

        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }

        return list;
    }

//    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//
//        int n = candies.length;
//        ArrayList<Boolean> list = new ArrayList<Boolean>(n);
//
//        for (int i = 0; i < n; i++) {
//            int compare = 0;
//            boolean flag = false;
//            compare = candies[i] + extraCandies;
//
//            for (int j = 0; j < n; j++) {
//                if (candies[j] > compare) {
//                    list.add(false);
//                    flag = true;
//                    break;
//                }
//            }
//
//
//            if (flag == false) {
//                list.add(true);
//            }
//        }
//        return list;
//    }

    }

