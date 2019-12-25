package com.javarush.task.task19.task1914;
/*
Решаем пример
*/
import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream( outputStream );

        System.setOut( myStream );
        testString.printSomething();
        String[] mass = outputStream.toString().trim().split(" ");

        System.setOut( console );
        int result = 0;
        if ( mass[1].equals("+") ){
            result = Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]);
        }else if ( mass[1].equals("-") ){
            result = Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]);
        }else if( mass[1].equals("*") ){
            result = Integer.parseInt(mass[0]) * Integer.parseInt(mass[2]);
        }
        System.out.print( mass[0] + " " + mass[1] + " " + mass[2] + " " + mass[3] + " " + result );
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}