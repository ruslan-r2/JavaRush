package com.javarush.task.task13.task1318;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inStream = new FileInputStream( fileName );

        while (inStream.available() > 0)
        {
            char c = (char) inStream.read();
            System.out.print(c);
        }
        inStream.close(); //закрываем потоки
        reader.close();
    }
}