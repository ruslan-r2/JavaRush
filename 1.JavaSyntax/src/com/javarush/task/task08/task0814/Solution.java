package com.javarush.task.task08.task0814;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> hasSet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            hasSet.add(i);
        }
        return hasSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int n = (int) iterator.next();
            if ( n > 10 ){
                iterator.remove();
            }
        }
        //System.out.println(set.toString());
        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());
    }
}
