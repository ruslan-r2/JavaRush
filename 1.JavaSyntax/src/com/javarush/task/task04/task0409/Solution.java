package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int n1 = a - 10;
        int n2 = b - 10;
        n1 = abs(n1);
        n2 = abs(n2);
        if (n1 >= n2){
            System.out.println(b);
        }else{
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}