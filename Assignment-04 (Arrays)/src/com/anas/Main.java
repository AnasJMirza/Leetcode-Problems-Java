package com.anas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rollNo = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter roll Number : ");
            int rollNoValue = in.nextInt();
            rollNo[i] = rollNoValue;
        }

        System.out.print("Array : " + Arrays.toString(rollNo));

        ArrayList<Integer> something =  new ArrayList<Integer>(5);
        something.add(6);
        System.out.println(something);

    }
}
