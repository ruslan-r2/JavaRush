package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader( fileName );
        BufferedReader bufferedReader1 = new BufferedReader( fileReader );
        String str;
        int count = 0;
        while ( (str = bufferedReader1.readLine()) != null ){
            str = str.replaceAll("[.,;:!?-]", " ");
            String[] mass = str.split(" ");
            for (int i = 0; i < mass.length; i++) {
                if ( mass[i].equalsIgnoreCase("world") ){
                    count++;
                }
            }
        }
        System.out.println(count);
        fileReader.close();
        bufferedReader1.close();
    }
}