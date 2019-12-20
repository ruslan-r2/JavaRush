package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        int num1 = Integer.parseUnsignedInt(bufferedReader.readLine());
        int num2 = Integer.parseUnsignedInt(bufferedReader.readLine());

        if( num1 < 0 || num2 < 0) throw new Exception();
        System.out.println( gcd( num1, num2 ) );
        bufferedReader.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }
}
