package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName;
        while(!(fileName = bufferedReader.readLine()).equals("exit")){
            resultMap.put( fileName, null );
        }
        bufferedReader.close();
        Set<String> fileNames = resultMap.keySet();
        for ( String fName : fileNames ){
            new ReadThread(fName).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {

            int max = 0;
            int[] arrByte = new int[Byte.MAX_VALUE*2];

            try {
                FileInputStream fInputStream = new FileInputStream(this.fileName);
                while (fInputStream.available() > 0) {
                    int b = fInputStream.read();
                    arrByte[b]++;
                }
                fInputStream.close();
            } catch ( IOException e ){
                //
            }

            for (int i = 0; i < arrByte.length; i++) {
                if ( arrByte[i] > max ){
                    max = arrByte[i];
                }
            }
            for (int i = 0; i < arrByte.length; i++) {
                if ( arrByte[i] == max )
                    //System.out.print(i + " ");
                    synchronized (resultMap) {
                        resultMap.put(this.fileName, i);
                    }
            }
            //System.out.println(resultMap.toString());
        }
    }
}