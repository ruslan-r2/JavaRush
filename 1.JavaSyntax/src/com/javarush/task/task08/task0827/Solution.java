package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        Date tDate = format.parse(date);
        //System.out.println(tDate);
        SimpleDateFormat begin = new SimpleDateFormat("D");
        int day = Integer.parseInt(begin.format(tDate));
        //System.out.println(day);
        if((day-1)%2 == 0) {
            return true;
        } else{
            return false;
        }
    }
}
