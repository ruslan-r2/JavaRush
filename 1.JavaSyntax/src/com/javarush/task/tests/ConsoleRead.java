package com.javarush.task.tests;

import java.io.*;

class ConsoleRead {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

            FileWriter fileReader = new FileWriter(file); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
            }

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
