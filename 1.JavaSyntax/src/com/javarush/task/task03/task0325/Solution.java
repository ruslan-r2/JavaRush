package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String sNumber = bufferedReader.readLine(); //читаем строку с клавиатуры
        int number = Integer.parseInt(sNumber); //преобразовываем строку в число.


        System.out.println("Я буду зарабатывать $" + number + " в час");

    }
}
