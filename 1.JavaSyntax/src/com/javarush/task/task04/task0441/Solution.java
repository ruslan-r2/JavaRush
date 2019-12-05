package com.javarush.task.task04.task0441;

/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
        String sN1 = bufferedReader.readLine();
        String sN2 = bufferedReader.readLine();
        String sN3 = bufferedReader.readLine();
        bufferedReader.close();

        int a = Integer.parseInt(sN1);
        int b = Integer.parseInt(sN2);
        int c = Integer.parseInt(sN3);

        if ( a <= b && a <= c ){
            if ( b <= c ){
                System.out.println(b);
            }else{
                System.out.println(c);
            }

        }else if( b <= a && b <= c ){
            if ( a <= c ){
                System.out.println(a);
            }else{
                System.out.println(c);
            }

        }else if( c <= a && c <= b ){
            if ( a <= b ){
                System.out.println(a);
            }else{
                System.out.println(b);
            }

        }

    }
}
