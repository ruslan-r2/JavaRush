package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        String sN3 = bufferedReader.readLine();
        String sN4 = bufferedReader.readLine();
        bufferedReader.close();

        int a = Integer.parseInt(sN1);
        int b = Integer.parseInt(sN2);
        int c = Integer.parseInt(sN3);
        int d = Integer.parseInt(sN4);

        if ( a >= b && a >= c && a >= d ){
            System.out.println(a);

        }else if ( b >= a && b >= c && b >= d ){
            System.out.println(b);

        }else if ( c >= a && c >= b && c >= d ){
            System.out.println(c);

        }else if ( d >= a && d >= b && d >= c ){
            System.out.println(d);

        }

    }
}
