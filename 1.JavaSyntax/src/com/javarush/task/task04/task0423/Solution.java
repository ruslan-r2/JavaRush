package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));
        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        bufferedReader.close();

        int age = Integer.parseInt(sAge);

        if ( age > 20 ){
            System.out.println("И 18-ти достаточно");
        }

    }
}
