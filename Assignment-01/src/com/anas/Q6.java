// Q - 06 : Input currency in rupees and output in USD.

package com.anas;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter currency in rupees : ");
        float currencyRupee = in.nextFloat();

        float currencyDollar = (currencyRupee * 170);    // 170 is dollar rate in pakistan

        System.out.println("currency in dollars = " + currencyDollar);

    }
}
