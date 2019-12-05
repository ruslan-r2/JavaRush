package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать массив на 10 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна выводить 10 строчек, каждую с новой строки.
4. Массив должен быть выведен на экран в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] nArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < nArray.length; i++)
        {
            String s = reader.readLine();
            nArray[i] = Integer.parseInt(s);
        }
        for (int i = nArray.length-1; i >= 0; i--){
            System.out.println(nArray[i]);
        }
    }
}

