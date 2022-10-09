package com.anas;

// 1773. Count Items Matching a Rule

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int ans = 0;

        if(ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        }else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }else{
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }

        return ans;
    }
}
