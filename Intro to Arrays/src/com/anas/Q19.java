package com.anas;

// https://leetcode.com/problems/maximum-population-year/

public class Q19 {
    public static void main(String[] args) {

    }

    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for(int person[] : logs){
            int birthYear = person[0];
            int deathYear = person[1];
            arr[birthYear - 1950]++;
            arr[deathYear - 1950]--;
        }

        int maxPeople = arr[0];
        int maxYear = 1950;
        for(int i = 1; i < 101; i++){
            arr[i] += arr[i - 1];
            if(maxPeople < arr[i]){
                maxPeople = arr[i];
                maxYear = i + 1950;
            }
        }

        return maxYear;
    }
}
