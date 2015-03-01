package com.sourceit.homework.hw02.Task01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by User on 23.02.2015.
 */
public class Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        int i=0;

        do {
            i++;
            n=n/10;
        }
        while (n>0);

        System.out.println("The sum of digits = "+i);
    }
}
