package com.sourceit.homework.hw01.Task05;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by User on 15.02.2015.
 */
public class Math{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rnd = (-n) + (int)(random()*(n-(-n))+1);
        System.out.println(rnd);
    }


}

