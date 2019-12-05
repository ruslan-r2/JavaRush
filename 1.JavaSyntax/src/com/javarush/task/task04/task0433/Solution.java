package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 1;

        while ( count <= 100 ){
            System.out.print(count++%10==0 ? "S\n" : "S");
        }

    }
}
