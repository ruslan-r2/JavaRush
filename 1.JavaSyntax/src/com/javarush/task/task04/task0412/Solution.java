package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
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

        if (number > 0){
            number = number * 2;
            System.out.println(number);
        }
        else if (number < 0){
            number = number + 1;
            System.out.println(number);
        }else{
            System.out.println(number);
        }

    }

}