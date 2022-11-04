package com.anas;

public class searchInStrings {
    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'W';
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target){

        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target){
                return true;
            }
        }

        return false;
    }
}
