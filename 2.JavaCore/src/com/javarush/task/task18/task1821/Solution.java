package com.javarush.task.task18.task1821;
/*
Встречаемость символов
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //String[] arg = {"file.txt"};
        FileInputStream inputStream = new FileInputStream( args[0] );

        int[] arrByte = new int[Byte.MAX_VALUE*2];
        while ( inputStream.available() > 0 ){
            int b = inputStream.read();
                arrByte[b]++;
        }
        inputStream.close();

        for (int i = 0; i < arrByte.length; i++) {
            if ( arrByte[i] > 0 ) {
                char ch = (char) i;
                System.out.println( ch + " " + arrByte[i]);
            }
        }

    }
}
