package com.javarush.task.task18.task1817;
/*
Пробелы
*/
import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        //String[] arg = {"file.txt"};
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int count = 0;
        int countSpace = 0;

        while ( fileInputStream.available() > 0 ) {
            if ( fileInputStream.read() == 32 ){
                countSpace++;
            } else {
                count++;
            }
        }
        //System.out.println( countSpace + " " + count );
        System.out.printf("%.2f", (float) countSpace/(count+countSpace)*100 );
        fileInputStream.close();
    }
}
