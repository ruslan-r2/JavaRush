package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            list.add(list.get(i));
            //System.out.println(list.toString());
        }
        for (int i = 0; i < M; i++) {
            list.remove(0);
            //System.out.println(list.toString());
        }

        //Iterator<String> sIterator = list.iterator(); //создаем итератор
        //while(sIterator.hasNext()) {//до тех пор, пока в списке есть элементы
        //    String nextS = sIterator.next();//получаем следующий элемент
        //    System.out.println(nextS);//выводим его в консоль
        //}
        for (String x : list)
        {
            System.out.println(x);
        }
    }
}
