package com.javarush.task.task10.task1012;

import java.io.*;
import java.util.*;
/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += list.get( i ).replaceAll("\\s+", "" );
        }

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arry = str.toCharArray();
        int count = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < arry.length; j++) {
                if ( alphabet.get( i ).equals( arry[j] ) ) {
                    count++;
                }
            }
            map.put( alphabet.get(i), count );
            count = 0;
        }
        for ( Map.Entry<Character, Integer> elem : map.entrySet() ) {
            System.out.println( elem.getKey() + " " + elem.getValue() );
        }

    }
}
