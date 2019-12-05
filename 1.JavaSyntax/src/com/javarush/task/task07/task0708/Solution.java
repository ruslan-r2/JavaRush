package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        //ввод строк с клавиатуры
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            strings.add(s);
        }
        int max = 0;

        for (int i = 0; i < strings.size(); i++){
            if ( max > strings.get(i).length() ){
                max = max;
            }else{
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++){
            if ( strings.get(i).length() == max ){
                System.out.println(strings.get(i));
            }
        }

        //System.out.println(max);
    }
}
