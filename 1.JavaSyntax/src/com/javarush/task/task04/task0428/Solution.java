package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
        String sNumber1 = bufferedReader.readLine();
        String sNumber2 = bufferedReader.readLine();
        String sNumber3 = bufferedReader.readLine();

        bufferedReader.close();

        int num1 = Integer.parseInt(sNumber1);
        int num2 = Integer.parseInt(sNumber2);
        int num3 = Integer.parseInt(sNumber3);

        int count = 0;

        if ( num1 > 0 ){
            count++;
        }
        if( num2 > 0 ){
            count++;
        }
        if( num3 > 0 ){
            count++;
        }
        System.out.println(count);

    }
}
