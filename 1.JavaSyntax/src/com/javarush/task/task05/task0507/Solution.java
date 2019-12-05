package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in));

        int cnt = 0;
        double sum = 0;

        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if ( number != -1 ){
                cnt++;
                sum += number;
            }else{
                break;
            }
        }
        bufferedReader.close();

        System.out.println( sum / cnt );

    }
}

