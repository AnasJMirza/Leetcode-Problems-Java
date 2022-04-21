package com.anas;
//1832. Check if the Sentence Is Pangram

public class Q10 {
    public static void main(String[] args) {
//        String str = "thequickbrownfoxjumpsoverthelazydog";
        String str = "leetcode";
        System.out.println(checkIfPangram(str));
        int[] arr = {1,2,3,4};
    }

    static boolean checkIfPangram(String sentence){
        for (int i = 'a'; i <= 'z'; i++) {
            boolean flag = false;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == i) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return false;
            }
        }

        return true;

    }
}
