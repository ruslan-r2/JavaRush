package com.javarush.task.task08.task0817;

import javax.swing.text.SimpleAttributeSet;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("Иванов","Василий1");
        map.put("Васильев","Иван");
        map.put("Петров","Олег");
        map.put("Сидоров","Иван");
        map.put("Иванов1","Олег");
        map.put("Синицин","Алексей");
        map.put("Путин","Владимир");
        map.put("Распутин","Владимир");
        map.put("Сечин","Вася");
        map.put("Пупкин","Вася");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        HashSet<String> set = new HashSet<>();
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            //System.out.println( key + " " + value );
            if (!set.add(value)) {
                removeItemFromMapByValue(map, value);
            }

        }
        //System.out.println(map.toString());

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
