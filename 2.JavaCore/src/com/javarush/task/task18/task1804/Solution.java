package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
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

        int min = 255;
        for (int i = 0; i < arrByte.length; i++) {
            if ( arrByte[i] >= 1 ){
                if (arrByte[i] < min) {
                    min = arrByte[i];
                }
            }
        }

        String str = "";
        for (int i = 0; i < arrByte.length; i++) {
            if ( arrByte[i] == min )
                str += i + " ";
        }
        System.out.print(str.trim());
    }
}
