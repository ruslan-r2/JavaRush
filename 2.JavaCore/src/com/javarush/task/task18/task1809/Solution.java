package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName1 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream1 = new FileOutputStream(fileName1);

        byte[] buffer = new byte[inputStream.available()];
        int count;
        while ( inputStream.available() > 0 ){
            count = inputStream.read(buffer);
        }
        for (int i = buffer.length-1; i >= 0; i--) {
            outputStream1.write(buffer[i]);
        }

        // закрываем поток
        inputStream.close();
        outputStream1.close();

    }
}
