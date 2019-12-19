package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String family;
        private boolean sex;
        private int age;
        private int weight;
        private int height;

        public Human(){}
        public Human( String name ){
            this.name = name;
        }
        public Human( String name, String family ){
            this.name = name;
            this.family = family;
        }
        public Human( String name, String family, boolean sex ){
            this.name = name;
            this.family = family;
            this.sex = sex;
        }
        public Human( String name, String family, boolean sex, int age ){
            this.name = name;
            this.family = family;
            this.sex = sex;
            this.age = age;
        }
        public Human( String name, String family, boolean sex, int age, int weight ){
            this.name = name;
            this.family = family;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }
        public Human( String name, String family, boolean sex, int age, int weight, int height ){
            this.name = name;
            this.family = family;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human( String name, String family, int age, int weight, int height ){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human( String name, String family, int age, int weight ){
            this.name = name;
            this.family = family;
            this.age = age;
            this.weight = weight;
        }
        public Human( String name, String family, int age ){
            this.name = name;
            this.family = family;
            this.age = age;
        }

    }
}
