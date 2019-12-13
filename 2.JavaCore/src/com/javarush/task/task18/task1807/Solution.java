package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);

        byte[] arrByte = new byte[Byte.MAX_VALUE*2];
        while ( inputStream.available() > 0 ){
            arrByte[inputStream.read()]++;
        }
        // закрываем поток
        inputStream.close();

        System.out.println(arrByte[44]);
    }
}
