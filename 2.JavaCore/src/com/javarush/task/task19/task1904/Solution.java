package com.javarush.task.task19.task1904;

import java.io.*;
import java.text.*;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;
        PersonScannerAdapter ( Scanner fileScanner ){
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException, ParseException {
            // Считываем строку сканером в массив строк разделенный на 4 части пробелом,
            // дату пихаем одной строкой.
            String[] mPerson = fileScanner.nextLine().split(" ", 4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String sDate = mPerson[3];
            String firstName = mPerson[1];
            String middleName = mPerson[2];
            String lastName = mPerson [0];
            Date date = dateFormat.parse(sDate);

            Person person = new Person( firstName, middleName, lastName, date);
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
