package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        //создаем объект FileInputStream, привязанный к файлу «filename».
        FileInputStream inputStream = new FileInputStream(fileName);
        int data = 255;
        //пока остались непрочитанные байты
        while (inputStream.available() > 0) {
            //прочитать очередной байт
            int tmp = inputStream.read();
            //System.out.println( tmp );
            if ( tmp < data ) {
                data = tmp;
            }
        }
        // закрываем поток
        inputStream.close();
        //выводим сумму на экран.
        System.out.println(data);
    }
}
