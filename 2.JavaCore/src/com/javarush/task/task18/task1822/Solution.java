package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        //String[] arg = {"125"};
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader( new FileReader( fileName ));
        // Считываем первую строку файла fileName1 и присваиваем переменной.
        String product = reader1.readLine();

        while ( product != null ) {
            // Разбиваем строку на элементы разделенные пробелом и заносим в массив
            String aProduct[] = product.split(" ");
            if ( aProduct[0].equals( args[0] ) ) {
                //System.out.println(Arrays.toString(aProduct));
                for (int i = 0; i < aProduct.length; i++) {
                    System.out.print( aProduct[i] + " " );
                }
            }
            // считываем остальные строки в цикле
            product = reader1.readLine();
        }
        // Закрываем поток.
        reader1.close();
    }
}
