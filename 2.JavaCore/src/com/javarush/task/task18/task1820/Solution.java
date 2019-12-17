package com.javarush.task.task18.task1820;
/*
Округление чисел
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем имя первого файла и сохраняем в переменной.
        String fileName1 = reader.readLine();
        // Считываем имя второго файла и сохраняем в переменной.
        String fileName2 = reader.readLine();
        // Закрываем поток работы с клавиатурой.
        reader.close();

        BufferedReader reader1 = new BufferedReader( new FileReader( fileName1 ));
        // Считываем первую строку файла fileName1 и присваиваем переменной.
        String numbers = reader1.readLine();
        // Разбиваем строку на элементы разделенные пробелом и заносим в массив
        String aNumbers[] = numbers.split(" ");
        // Закрываем поток.
        reader1.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        for (int i = 0; i < aNumbers.length; i++) {
            // Конвертируем элементы массива и округляем, и записываем в файл.
            writer.write(Math.round(Double.parseDouble(aNumbers[i]))+" ");
        }
        // Закрываем поток.
        writer.close();
    }
}
