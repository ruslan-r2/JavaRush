package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
            String[] mass = str.split(" ");
            for (int i = 0; i < mass.length; i++) {
                try {
                    String num = Integer.parseInt( mass[i] ) + " ";
                    bufferedWriter.write(num);
                }catch ( NumberFormatException e ){
                    //
                }

            }
        }
        bufferedReader1.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }
}
