package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
        String sNumber = bufferedReader.readLine();

        bufferedReader.close();

        int num = Integer.parseInt(sNumber);

        if ( num >= 1 && num <= 999){

            String str = "";
            if (num % 2 == 0) {
                str = "четное";
            } else {
                str = "нечетное";
            }

            if (sNumber.length() == 1) {
                str += " однозначное число";
            } else if (sNumber.length() == 2) {
                str += " двузначное число";
            } else if (sNumber.length() == 3) {
                str += " трехзначное число";
            }
            System.out.println(str);
        }


        /*
        Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
        "четное однозначное число" - если число четное и имеет одну цифру,
        "нечетное однозначное число" - если число нечетное и имеет одну цифру,
        "четное двузначное число" - если число четное и имеет две цифры,
        "нечетное двузначное число" - если число нечетное и имеет две цифры,
        "четное трехзначное число" - если число четное и имеет три цифры,
        "нечетное трехзначное число" - если число нечетное и имеет три цифры.
        Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
         */

    }
}
