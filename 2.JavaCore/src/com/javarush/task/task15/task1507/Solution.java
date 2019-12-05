package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Solution {
    public static void main(String[] args) {
        //printMatrix(2, 3, 8);
        printMatrix(2, 3, "8");
    }
    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заполняем объектами Long");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами Char");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами Boolean");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
