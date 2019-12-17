package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileOutputStream outputStream = new FileOutputStream(fileName1, true);
        FileInputStream inputStream1 = new FileInputStream(fileName2);
        FileInputStream inputStream2 = new FileInputStream(fileName3);

        byte[] buff1 = new byte[inputStream1.available()];
        inputStream1.read(buff1);

        byte[] buff2 = new byte[inputStream2.available()];
        inputStream2.read(buff2);

        outputStream.write(buff1);
        outputStream.write(buff2);

        // закрываем поток
        outputStream.close();
        inputStream1.close();
        inputStream2.close();
        //

    }
}
