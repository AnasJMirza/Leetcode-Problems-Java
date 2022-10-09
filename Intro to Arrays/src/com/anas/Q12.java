package com.anas;

//1732. Find the Highest Altitude

public class Q12 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain){
        int riderTimeline = 0;
        int highestAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            riderTimeline += gain[i];
            if (highestAltitude < riderTimeline){
                highestAltitude = riderTimeline;
            }
        }
        return highestAltitude;
    }
}
