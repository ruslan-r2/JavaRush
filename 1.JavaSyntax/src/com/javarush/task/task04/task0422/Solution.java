package com.javarush.task.task04.task0422;

/* 
18+
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

        if ( age < 18 ){
            System.out.println("Подрасти еще");
        }

    }
}
