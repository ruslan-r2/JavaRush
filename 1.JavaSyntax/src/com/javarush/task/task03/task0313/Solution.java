package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String text1 = "Мама";
        String text2 = "Мыла";
        String text3 = "Раму";

        System.out.println(text1+text2+text3);
        System.out.println(text1+text3+text2);
        System.out.println(text2+text1+text3);
        System.out.println(text2+text3+text1);
        System.out.println(text3+text1+text2);
        System.out.println(text3+text2+text1);
    }
}
