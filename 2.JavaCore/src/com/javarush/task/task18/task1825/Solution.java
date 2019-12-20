package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {

    public static void main( String[] args ) throws IOException {

        List<String> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName;
        while ( !(fileName = bufferedReader.readLine()).equals("end") ){
            list.add( fileName );
        }

        bufferedReader.close();
        Collections.sort(list);

        BufferedInputStream bufferedInputStream = null;
        FileInputStream inputStream = null;
        //
        String fn[] = list.get(1).split("\\.");
        fileName = fn[0] + "." + fn[1];
        //System.out.println( Arrays.toString( fn ) );
        // ********************************************************************
        FileOutputStream fileOutputStream = new FileOutputStream ( fileName );
        for ( String elem : list ){
            //System.out.println( elem );
            inputStream = new FileInputStream ( elem );
            bufferedInputStream = new BufferedInputStream ( inputStream );
            byte [] buffer = new byte [ bufferedInputStream.available () ];
            while ( bufferedInputStream.available() > 0){
                int count = bufferedInputStream.read( buffer );
                fileOutputStream.write( buffer, 0, count );
            }
            bufferedInputStream.close();
        }
        // ********************************************************************
        fileOutputStream.close();
    }

}
