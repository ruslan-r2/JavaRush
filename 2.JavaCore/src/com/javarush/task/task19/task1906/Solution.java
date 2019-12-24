package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName = bufferedReader.readLine();
        String fileName1 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader( fileName );
        FileWriter fileWriter = new FileWriter( fileName1 );

        int c;
        int count = 1;
        while ( (c = fileReader.read()) > -1 ) {
            if ( count%2 == 0 ) {
                fileWriter.write(c);
            }
            count++;
        }

        fileReader.close();
        fileWriter.close();

    }
}
