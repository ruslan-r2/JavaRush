package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        List<String> str = new ArrayList<String>();
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if ( isNumber( array[i]) ){
                num.add( Integer.parseInt( array[i] ) );
            }else{
                str.add( array[i] );
            }
        }

        Collections.sort(num, Collections.reverseOrder());
        Collections.sort(str);
        //System.out.println( num.toString() );
        //System.out.println( str.toString() );

        for (int i = 0; i < array.length; i++) {
            if ( isNumber( array[i]) ){
                array[i] = String.valueOf(num.get(0));
                num.remove(0);
            }else{
                array[i] = str.get(0);
                str.remove(0);
            }
        }
        isGreaterThan("sdd", "sdfr");

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
