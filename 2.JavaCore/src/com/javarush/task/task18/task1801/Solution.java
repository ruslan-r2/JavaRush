package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».
        FileInputStream inputStream = new FileInputStream(fileName);
        int data = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int tmp = inputStream.read(); //прочитать очередной байт
            if ( tmp > data ) {
                data = tmp;
            }
        }
        inputStream.close(); // закрываем поток

        System.out.println(data); //выводим сумму на экран.
    }
}
