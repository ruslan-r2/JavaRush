package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        bufferedReader.close();

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);

        if ( n1 <= n2 ) {
            System.out.println(n1);

        }else{
            System.out.println(n2);

        }


    }
}