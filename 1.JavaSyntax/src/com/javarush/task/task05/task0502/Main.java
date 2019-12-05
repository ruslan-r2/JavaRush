package com.javarush.task.task05.task0502;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 5;
        cat1.strength = 5;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 6;
        cat2.strength = 6;

        System.out.println( cat1.fight(cat2) );

        System.out.println( cat2.fight(cat1) );

    }
}
