// Q - 09 : Reverse A String In Java

package com.anas;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = in.next();

        for (int i = str.length(); i > 0; i--){
            System.out.print(str.charAt(i - 1) + " ");
        }
    }
}
