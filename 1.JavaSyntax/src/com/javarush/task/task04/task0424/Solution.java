package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if ( a == b && a != c) {
            System.out.println(3);
        }else if ( b == c && b != a ) {
            System.out.println(1);
        }else if (a == c && a != b){
            System.out.println(2);
        }

    }
}
