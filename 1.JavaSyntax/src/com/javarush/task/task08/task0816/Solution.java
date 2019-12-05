package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        //напишите тут ваш код
        map.put("Винипух", dateFormat.parse("NOVEMBER 3 1980"));
        map.put("Пятачок", dateFormat.parse("JUNE 7 1989"));
        map.put("Васерман", dateFormat.parse("JUNE 7 1960"));
        map.put("Васерман1", dateFormat.parse("JUNE 7 1960"));
        map.put("Васерман2", dateFormat.parse("JULY 7 1960"));
        map.put("Васерман3", dateFormat.parse("AUGUST 7 1960"));
        map.put("Васерман4", dateFormat.parse("OCTOBER 7 1960"));
        map.put("Васерман5", dateFormat.parse("JUNE 7 1960"));
        map.put("Васерман6", dateFormat.parse("DECEMBER 7 1960"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Date value = pair.getValue();        //значение
            //System.out.println(key + ":" + value);
            if (value.getMonth() >= 5 && value.getMonth() <= 7){
                iterator.remove();
            }
        }
        //System.out.println(map.toString());
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
