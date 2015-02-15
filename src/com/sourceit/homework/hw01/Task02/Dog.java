package com.sourceit.homework.hw01.Task02;

/**
 * Created by User on 15.02.2015.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        System.out.println(spot.says="Ruff!");
        System.out.println(scruffy.says="Wurf!");
    }
}
