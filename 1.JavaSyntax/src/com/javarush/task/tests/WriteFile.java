package com.javarush.task.tests;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "fo"};
        try {
            File file = new File("file.txt");
            FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter

            for(String s : list) {
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}