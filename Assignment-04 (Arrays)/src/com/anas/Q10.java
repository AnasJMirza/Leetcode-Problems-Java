package com.anas;

import java.util.Scanner;

public class Q10 {
//    1832. Check if the Sentence Is Pangram (LEETCODE QUESTION)
//    A pangram is a sentence where every letter of the English alphabet appears at least once.
//    Link = https://leetcode.com/problems/check-if-the-sentence-is-pangram/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string without spaces : ");
        String str = in.next();
        System.out.println(checkIfPangram(str));
    }


    static boolean checkIfPangram(String sentence) {
        boolean flag = false;
        for (int alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            flag = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == alphabet){
                    flag = true;
                    break;
                }
            }

            if (flag == false){
                return false;
            }
        }
        return true;
    }
}
