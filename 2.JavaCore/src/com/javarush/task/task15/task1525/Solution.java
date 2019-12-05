package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Требования:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            File file = new File(Statics.FILE_NAME);
            FileReader fileReader = new FileReader(file); // поток который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line); // выводим содержимое файла на экран построчно
                lines.add(line);
            }

            bufferedReader.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
        //System.out.println(Statics.FILE_NAME);
    }
}
