package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNumber1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sNumber2 = bufferedReader.readLine(); //читаем строку с клавиатуры

        int Number1 = Integer.parseInt(sNumber1); //преобразовываем строку в число.
        int Number2 = Integer.parseInt(sNumber2); //преобразовываем строку в число.

        System.out.println(name + " получает " + Number1 + " через " + Number2 + " лет.");

    }
}
