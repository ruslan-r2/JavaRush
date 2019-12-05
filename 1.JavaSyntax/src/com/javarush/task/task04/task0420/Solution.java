package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        bufferedReader.close();

        int a = Integer.parseInt(sN1);
        int b = Integer.parseInt(sN2);
        int c = Integer.parseInt(sN3);

        if ( a <= b && a <= c ){
            if ( b <= c ){
                System.out.println( c + " " + b + " " + a );
            }else{
                System.out.println( b + " " + c + " " + a );
            }

        }else if( b <= a && b <= c ){
            if ( a <= c ){
                System.out.println( c + " " + a + " " + b );
            }else{
                System.out.println( a + " " + c + " " + b );
            }

        }else if( c <= a && c <= b ){
            if ( a <= b ){
                System.out.println( b + " " + a + " " + c );
            }else{
                System.out.println( a + " " + b + " " + c );
            }

        }

    }
}
