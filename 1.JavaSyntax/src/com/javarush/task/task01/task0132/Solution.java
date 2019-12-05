package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    private static int number;

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));

    }

    public static int sumDigitsInNumber(int number) {
        Solution.number = number;
        //напишите тут ваш код
        int n = number;
        int s = 0, m = 1;
        for (int i = 0; i < 3; i++) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}