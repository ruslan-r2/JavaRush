package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();

        URL url = new URL(str);
        //System.out.println( url.getQuery() );
        str = url.getQuery();
        String[] str1 = str.split("&");
        ArrayList<String> obj = new ArrayList<>(str1.length);
        //System.out.println(str1.length);
        for (String element : str1) {
            int i = 0;
            if (element.contains("=")) {
                int index = element.indexOf("=");
                System.out.print(element.substring(0, index) + " ");
                if (element.substring(0, index).equals("obj")) {
                    obj.add(element);
                    i++;
                }
            }
            else System.out.print(element + " ");
        }
        System.out.println("");
        for (String element : obj) {
            if ( element.contains("=") ) {
                int index = element.indexOf("=");
                String value = element.substring(index + 1);
                if (isDigit(value)) {
                    alert(Double.parseDouble(value));
                }
                else alert(value);
            }
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
