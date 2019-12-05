package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sNumber = bufferedReader.readLine(); //читаем строку с клавиатуры
        bufferedReader.close();

        int number = Integer.parseInt(sNumber); //преобразовываем строку в число.

        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        if (number >= 1 && number <= 7){
            System.out.println(days[number-1]);
        }
        else{
            System.out.println("такого дня недели не существует");
        }

    }
}