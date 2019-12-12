package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
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

        int max = 0;
        for (int i = 0; i < arrByte.length-1; i++) {
            if ( arrByte[i] > max ){
                max = arrByte[i];
            }
        }

        for (int i = 0; i < arrByte.length; i++) {
            if ( arrByte[i] == max )
            System.out.print(i + " ");
        }
    }
}
