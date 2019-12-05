package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sA = bufferedReader.readLine();
        String sB = bufferedReader.readLine();
        bufferedReader.close();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        if ( a > 0 && b > 0){
            System.out.println(1);
        }else if( a < 0 && b > 0){
            System.out.println(2);
        }else if( a < 0 && b < 0){
            System.out.println(3);
        }else if ( a>0 && b < 0){
            System.out.println(4);
        }

    }
}
