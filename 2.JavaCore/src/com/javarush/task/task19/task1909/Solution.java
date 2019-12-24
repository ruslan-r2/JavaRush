package com.javarush.task.task19.task1909;

/* 
Замена знаков
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

        BufferedReader bufferedReader1 = new BufferedReader( fileReader );
        BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );

        String str;
        while ( (str = bufferedReader1.readLine()) != null )  {
            str = str.replaceAll("[.]", "!");
            bufferedWriter.write(str);
        }

        bufferedReader1.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }
}
