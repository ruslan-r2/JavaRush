package com.javarush.task.tests;

import com.javarush.task.task04.task0404.Cat;

public class test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska1");
        Cat cat2 = new Cat("Vaska2");

        System.out.println( cat1.name );
        System.out.println( cat2.name );
    }

    public static class Cat {
        String name;
        public Cat(String name) {
            this.name = name;
        }
    }

}
