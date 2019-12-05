package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sNumber = bufferedReader.readLine(); //читаем строку с клавиатуры
        bufferedReader.close();

        int n = Integer.parseInt(sNumber); //преобразовываем строку в число.

        if (n % 4 == 0) {
            if ((n % 100 != 0) || (n % 400 == 0)) {
                System.out.println("количество дней в году: 366");
            } else {
                System.out.println("количество дней в году: 365");
            }
        }else{
            System.out.println("количество дней в году: 365");
        }

    }
}