package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

Требования:
1. Программа должна считывать два числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
4. В программе должен использоваться цикл for.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        bufferedReader.close();

        int n1 = Integer.parseInt(sNum1);
        int n2 = Integer.parseInt(sNum2);

        for (int i = 1; i <= n1; i++){
            for (int j = 1; j <= n2; j++){
                System.out.print(8);
            }
            System.out.println();

        }

    }
}
