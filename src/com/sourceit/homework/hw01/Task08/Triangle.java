package com.sourceit.homework.hw01.Task08;

import java.util.Scanner;
import java.lang.Math.*;

/**
 * Created by User on 19.02.2015.
 */
public class Triangle {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (int)Math.pow((int)(a),2)+ (int)Math.pow((int)(b),2);
        System.out.println(c=c/2); //hypotenuse
        int p;
        System.out.println(p=a+b+c); //perimeter
        double s;
        System.out.println(s=0.5*(a+b)); //square
    }

}
