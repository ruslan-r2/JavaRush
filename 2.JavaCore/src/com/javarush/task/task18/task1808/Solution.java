package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);

        int nByte = inputStream.available();
        int count = nByte/2;

        while ( inputStream.available() > count ){
            outputStream1.write( inputStream.read() );
        }

        while ( inputStream.available() > 0) {
            outputStream2.write( inputStream.read() );
        }

        // закрываем поток
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
        //
    }
}