package com.javarush.task.tests;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file); // поток который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // выводим содержимое файла на экран построчно
            }

            bufferedReader.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
