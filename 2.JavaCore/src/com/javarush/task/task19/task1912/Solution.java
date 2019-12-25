package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
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

        String str = outputStream.toString().replaceAll("te","??");

        System.setOut( console );
        System.out.print( str );
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}