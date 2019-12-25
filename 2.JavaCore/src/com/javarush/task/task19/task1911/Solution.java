package com.javarush.task.task19.task1911;
/*
Ридер обертка
*/
import java.io.*;

public class Solution {
    public static TestString testString = new TestString();
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream( outputStream );

        System.setOut( myStream );
        testString.printSomething();

        String str = outputStream.toString().toUpperCase();

        System.setOut( console );
        System.out.print( str );
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("it's a text for testing");
        }
    }
}
