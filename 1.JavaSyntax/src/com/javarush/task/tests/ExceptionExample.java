package com.javarush.task.tests;

public class ExceptionExample
{
    private static Exception exception = null;

    public static void main(String[] args){
        System.out.println("main begin");
        System.out.println("main before call");
        method1();
        if (exception == null){
            System.out.println("main after call");
        }
        else if (exception instanceof RuntimeException){
            RuntimeException e = (RuntimeException) exception;
            exception = null;
            String s = e.getMessage();
            System.out.println(s);
        }
        System.out.println("main end");
    }

    public static void method1(){
        System.out.println("method1 begin");
        method2();
        if (exception != null) return;
        System.out.println("method1 end");
    }

    public static void method2(){
        System.out.println("method2");
        String s = "Message: Unknown Exception";
        exception = new RuntimeException(s);
        return;
    }
}
