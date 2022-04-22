package com.anas;
//1773. Count Items Matching a Rule

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>(3));
        }
        list.get(0).add(0,"phone");
        list.get(0).add(1,"blue");
        list.get(0).add(2,"pixel");

        list.get(1).add(0,"computer");
        list.get(1).add(1,"silver");
        list.get(1).add(2,"phone");

        list.get(2).add(0,"phone");
        list.get(2).add(1,"gold");
        list.get(2).add(2,"iphone");


        System.out.println(list);

        String  ruleKey = "color";
        String ruleValue = "blue";
        System.out.println(countMatches(list, ruleKey, ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
//        System.out.println(items.size());
        int match = 0;

        switch (ruleKey){
            case "type":
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(0).equals(ruleValue)){
                        match++;
                    }
                }
                break;

            case "color":
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(1).equals(ruleValue)){
                        match++;
                    }
                }
                break;

            case "name":
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).get(2).equals(ruleValue)){
                        match++;
                    }
                }
                break;
        }

        return match;
    }
}
