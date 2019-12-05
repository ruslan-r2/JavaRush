package com.javarush.task.task08.task0815;

import java.io.*;
import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Петров","Андрей");
        map.put("Синицын","Николай");
        map.put("Воробъёв","Алексей");
        map.put("Капустин","Роман");
        map.put("Бодров","Антон");
        map.put("Скворцов","Андрей");
        map.put("Малахов","Андрей");
        map.put("Овечкин","Александр");
        map.put("Бурков","Дмитрий");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int freq = Collections.frequency(map.values(), name);
        return freq;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int freq = Collections.frequency(map.keySet(), lastName);
        return freq;
    }

    public static void main(String[] args) {
        //Map<String,String> map = createMap();
        //System.out.println(getCountTheSameFirstName(map, "Иванов"));
        //System.out.println(getCountTheSameLastName(map, "Андрей"));
    }
}

        /*
        Set<String > keys = map.keySet();
        for (Map.Entry<String,String> item : map.entrySet()  ){
            System.out.println(item.getKey() + " - " + item.getValue());
            if (item.getKey() == ""){

            }
        }
        */