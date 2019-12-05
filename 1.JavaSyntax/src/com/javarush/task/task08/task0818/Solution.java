package com.javarush.task.task08.task0818;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов",300);
        map.put("Петров", 400);
        map.put("Синицын", 500);
        map.put("Воробъёв", 300);
        map.put("Капустин", 400);
        map.put("Бодров", 600);
        map.put("Скворцов", 700);
        map.put("Малахов", 1000);
        map.put("Овечкин", 10000);
        map.put("Бурков", 50);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while ( iterator.hasNext() ) {
            Map.Entry<String, Integer> pair = iterator.next();
            String family = pair.getKey();
            Integer zp = pair.getValue();
            if ( zp < 500) {
                iterator.remove();
            }
        }
        //System.out.println(map.toString());
    }

    public static void main(String[] args) {
        //removeItemFromMap(createMap());
    }
}