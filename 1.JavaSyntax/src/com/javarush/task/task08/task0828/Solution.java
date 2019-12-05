package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine() ;

        Map<Integer,String> manth = new HashMap<Integer,String>();
        manth.put(0,"January is the 1 month");
        manth.put(1,"February is the 2 month");
        manth.put(2,"March is the 3 month");
        manth.put(3,"April is the 4 month");
        manth.put(4,"May is the 5 month");
        manth.put(5,"June is the 6 month");
        manth.put(6,"July is the 7 month");
        manth.put(7,"August is the 8 month");
        manth.put(8,"September is the 9 month");
        manth.put(9,"October is the 10 month");
        manth.put(10,"November is the 11 month");
        manth.put(11,"December is the 12 month");

        DateFormat dateFormat = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
        //System.out.println( dateFormat.parse(str).getMonth() );
        System.out.println(manth.get(dateFormat.parse(str).getMonth()));


    }
}
