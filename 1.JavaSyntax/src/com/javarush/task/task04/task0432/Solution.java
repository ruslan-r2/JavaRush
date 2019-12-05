package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ));

        String str = bufferedReader.readLine();
        String sNum = bufferedReader.readLine();

        bufferedReader.close();

        int N = Integer.parseInt(sNum);

        while ( N > 0 ){
            System.out.println(str);
            N--;
        }

    }
}
