package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //OutputStream outputStream = new FileOutputStream("file1.txt");
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        //BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt"));
        String str = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(str));
        //bw.write(str + System.lineSeparator());

        while ( true ){
            str = reader.readLine();
            if (str.equals("exit")){
                bw.write(str);
                break;
            }else{
                bw.write(str);
                bw.newLine();
            }
        }
        reader.close();
        bw.close();
    }
}
