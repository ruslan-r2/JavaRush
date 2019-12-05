package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        List<Integer> list = new ArrayList<>();

        while (fileReader.ready()){
            list.add(Integer.parseInt(fileReader.readLine()));
        }

        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = Integer.valueOf(list.get(i));
        }

        Arrays.sort(array);

        for (Integer i : array) {
            if ( i%2 == 0 ) {
                System.out.println(i);
            }
        }

        fileReader.close(); //закрываем потоки

    }
}
