package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName = "";
        private String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.fileContent;
        }

        public void run() {
            try {
                File file = new File(fileName);
                // поток который подключается к текстовому файлу
                FileReader fileReader = new FileReader(file);
                // соединяем FileReader с BufferedReader
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while((line = bufferedReader.readLine()) != null) {
                    fileContent += line + " ";
                }
                // закрываем поток
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
