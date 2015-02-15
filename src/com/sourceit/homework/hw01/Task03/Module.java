package com.sourceit.homework.hw01.Task03;

import java.util.Scanner;

/**
 * Created by User on 15.02.2015.
 */
public class Module {
    int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = in.nextInt();
        n = n % 2;
        System.out.println(n == n % 2 ? n == 0 : n == 1);
        System.out.println(n);
    }
}
