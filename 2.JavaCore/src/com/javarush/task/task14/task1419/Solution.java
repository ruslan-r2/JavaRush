package com.javarush.task.task14.task1419;

import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;
import com.sun.org.apache.bcel.internal.ExceptionConstants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            Integer a = Integer.parseInt("строка");
        } catch (Exception e2) {
            exceptions.add(e2);
        }

        try {
            Integer b = null;
            System.out.println(b / 2);
        } catch (Exception e3) {
            exceptions.add(e3);
        }

        try {
            int[] c = {1,2,3};
            System.out.println(c[4]);
        } catch (Exception e4){
            exceptions.add(e4);
        }

        try {
            Map<String, String> map = new HashMap<>();
            map.put("1", "Один");
            map.put("2", "Два");
            map.put("3", "Три");

            for (Map.Entry pair : map.entrySet()) {
                if (pair.getKey().equals("1")) {
                    map.entrySet().remove(pair);
                }
            }
        } catch (Exception e5) {
            exceptions.add(e5);
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\17302957\\text.txt");
            fis.close();
        } catch (Exception e6) {
            exceptions.add(e6);
        }

        try {
            Integer Value = Integer.parseInt(null);
        }catch (Exception e7){
            exceptions.add(e7);
        }

        try {
            int[] arrInt = new int[-1];
        } catch (Exception e8) {
            exceptions.add(e8);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (Exception e9) {
            exceptions.add(e9);
        }

        try {
            List<Integer> fixedSize = Arrays.asList(1,2,3);
            fixedSize.add(4);

        } catch (Exception e10) {
            exceptions.add(e10);
        }

    }
}
