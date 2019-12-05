package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sA = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sB = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sC = bufferedReader.readLine(); //читаем строку с клавиатуры
        bufferedReader.close();

        int a = Integer.parseInt(sA); //преобразовываем строку в число.
        int b = Integer.parseInt(sB); //преобразовываем строку в число.
        int c = Integer.parseInt(sC); //преобразовываем строку в число.

        if (a < b + c && b < a + c && c < b + a ){
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }

    }
}