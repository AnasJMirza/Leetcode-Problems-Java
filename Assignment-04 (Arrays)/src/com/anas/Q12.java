package com.anas;
//1732. Find the Highest Altitude

public class Q12 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain){
        int maxAltitude = 0;
        int check = 0;
        for (int i = 0; i < gain.length; i++) {
            check = check + gain[i];
            if (maxAltitude < check) {
                maxAltitude = check;
            }
        }

        return maxAltitude;
    }
}
