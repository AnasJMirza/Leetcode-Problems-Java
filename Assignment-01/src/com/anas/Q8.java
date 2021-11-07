// Q - 08 : To find out whether the given String is Palindrome or not.

package com.anas;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String randomString = in.next();

        boolean flag = false;
        for (int i = 0; i < randomString.length() / 2; i++){
            if (randomString.charAt(i) != randomString.charAt(randomString.length() - 1 - i)){
                System.out.println("String is not palindrome");
                flag = true;
                break;
            }
        }

        if (flag == false){
            System.out.println("String is palindrome");
        }
    }
}
