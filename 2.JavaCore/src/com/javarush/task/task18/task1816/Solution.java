package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String[] arg = {"file.txt"};
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        while ( fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            if( b > 64 & b < 91 || b > 96 & b < 123 ) count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
