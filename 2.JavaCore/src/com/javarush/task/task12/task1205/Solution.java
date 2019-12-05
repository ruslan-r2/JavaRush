package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        switch ( o.getClass().getSimpleName() ) {
            case  ( "Cow" ):
                return "Корова";
                //break;
            case ("Dog"):
                return "Собака";
                //break;
            case ("Whale"):
                return "Кит";
                //break;
            default:
                return "Неизвестное животное";
                //break;
        }
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
