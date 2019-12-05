package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        //ввод строк с клавиатуры
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            strings.add(s);
        }
        int last = strings.size()-1;
        for (int i = 0; i < 13; i++) {
            String tmp = strings.get(last);
            strings.remove(last);
            strings.add(0,tmp);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
