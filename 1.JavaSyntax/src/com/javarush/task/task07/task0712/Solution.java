package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        //ввод строк с клавиатуры
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            strings.add(s);
        }

        int min = 64000;
        int max = 0;

        for (int i = 0; i < strings.size(); i++){
            if ( min < strings.get(i).length() ){
                min = min;
            }else{
                min = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++){
            if ( max > strings.get(i).length() ){
                max = max;
            }else{
                max = strings.get(i).length();
            }
        }
        //System.out.println(min);
        //System.out.println(max);
        for (int i = 0; i < strings.size(); i++){
            if ( strings.get(i).length() == min || strings.get(i).length() == max){
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
