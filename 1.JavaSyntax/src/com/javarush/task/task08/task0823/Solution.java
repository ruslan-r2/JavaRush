package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        //напишите тут ваш код
        List<String> list = new ArrayList<>(Arrays.asList(string.split(" ")));
        List<String> list1 = new ArrayList<String>();

        //System.out.println(list.toString());
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            String tmp = itr.next().toString();
            if ( tmp.length() == 0 ){
                itr.remove();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            String str = list.get(i);
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            list1.add(i, str);
        }
        String str = " ";
        for (int i = 0; i < list1.size(); i++) {
            str += list1.get(i) + " ";
        }
        System.out.print(str.trim());
    }
}
