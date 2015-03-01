package com.sourceit.homework.hw01.Task06;

import java.util.Scanner;

/**
 * Created by User on 01.03.2015.
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextInt();
        float m = in.nextInt();
        float d = (float)n/10;
        float e = (float)m/10;
        float m1 = min(d,e);
        if (m1 == d)
        System.out.println("Ближайшее к 10 is "+n);
        else
            System.out.println("Ближайшее к 10 is "+m);
    }
   public static float min(float a, float b){
       float m2;
        if (a<b)
            m2=a;
        else
            m2=b;
       return  m2;

    }
}
