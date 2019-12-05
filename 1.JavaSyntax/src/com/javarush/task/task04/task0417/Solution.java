package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);
        int n3 = Integer.parseInt(sN3);

        if ( n1 == n2 && n2 == n3 ){
            System.out.println( n1 + " " + n2 + " " + n3 );

        }else if ( n1 == n2 && n2 != n3 ){
            System.out.println( n1 + " " + n2 );

        }else if (n1 != n2 && n2 == n3){
            System.out.println( n2 + " " + n3 );

        }else if (n1 == n3 && n2 != n3){
            System.out.println( n1 + " " + n3 );
        }

    }
}