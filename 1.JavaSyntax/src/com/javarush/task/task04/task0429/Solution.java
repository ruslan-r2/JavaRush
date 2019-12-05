package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных
чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а",
"количество положительных чисел: б",
где а, б - искомые значения.


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

        int count1 = 0;
        int count2 = 0;

        if ( num1 > 0 ){ count1++; }
        else if(num1 < 0 && num1 != 0 ) { count2++; }

        if( num2 > 0 ){ count1++; }
        else if(num2 < 0 && num2 != 0 ){ count2++; }

        if ( num3 > 0 ){ count1++; }
        else if(num3 < 0 && num3 != 0 ){ count2++; }

        System.out.println("количество положительных чисел: " + count1);
        System.out.println("количество отрицательных чисел: " + count2);

    }
}
