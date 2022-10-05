package com.anas;

// 1832. Check if the Sentence Is Pangram

import java.sql.PreparedStatement;

public class Q10 {
    public static void main(String[] args) {
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence){
        boolean result = true;
        for (char i = 'a'; i <= 'z'; i++) {
            boolean flag = false;
            for (int j = 0; j < sentence.length(); j++) {

                if (i == sentence.charAt(j)){
                    flag = true;
                    break;
                }
            }

            if (flag == false){
                result = false;
                break;
            }

        }
        return result;
    }
}
