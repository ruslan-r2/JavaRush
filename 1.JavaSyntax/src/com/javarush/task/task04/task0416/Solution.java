package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sMin = bufferedReader.readLine(); //читаем строку с клавиатуры
        bufferedReader.close();

        double min = Double.parseDouble(sMin);

        double b = min % 5;
        if ( b>=0 && b<3 ){
            System.out.println("зелёный");
        }
        else if (b>=3 && b<4) {
            System.out.println("жёлтый");
        }
        else if (b>=4 && b<5) {
            System.out.println("красный");
        }
    }

 }