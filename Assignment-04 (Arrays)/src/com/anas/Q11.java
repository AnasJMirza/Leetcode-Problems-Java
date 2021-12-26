package com.anas;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
//    1773. Count Items Matching a Rule (LEETCODE QUESTION)
//    Link = https://leetcode.com/problems/count-items-matching-a-rule/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<String>> items = new ArrayList<>(5);

//        initilize

        for (int i = 0; i < 4; i++) {
            items.add(new ArrayList<>());
        }

        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");

        items.get(1).add("computer");
        items.get(1).add("silver");
        items.get(1).add("lenovo");

        items.get(2).add("phone");
        items.get(2).add("gold");
        items.get(2).add("iphone");

        items.get(3).add("car");
        items.get(3).add("white");
        items.get(3).add("suzuki");

//        for (int i = 0; i < 3; i++) {
//            System.out.print("Add 3 itmes in Array list : ");
//            for (int j = 0; j < 3; j++) {
//                items.get(i).add(in.next());
//            }
//        }

//        System.out.println(items);
        System.out.print("Enter rule key : ");
        String ruleKey = in.next();
        System.out.print("Enter rule value : ");
        String ruleValue = in.next();

        System.out.println(items);
        int a = countMatches(items, ruleKey, ruleValue);
        System.out.println(a);
    }


    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {

        int match = 0;

        switch (ruleKey){
            case "type" :
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(0).equals(ruleValue)){
                        match += 1;
                    }
                }
                break;

            case "color" :
                for (int i = 0; i < items.size(); i++){
                    if (items.get(i).get(1).equals(ruleValue)){
                        match += 1;
                    }
                }
                break;

            case "name" :
                for (int i = 0; i < items.size(); i++){
                    if (items.get(i).get(2).equals(ruleValue)){
                        match += 1;
                    }
                }
                break;

            default:
                System.out.println("Please Enter valid ruleKey : ");
        }
        return match;
    }


}
