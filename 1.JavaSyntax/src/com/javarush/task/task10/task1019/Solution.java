package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();;

        while (true) {
            try {
                int index = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, index);
            }catch (NumberFormatException e){
                break;
            }
        }

        //System.out.println( map.toString() );

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name = pair.getKey();
            int index = pair.getValue();
            System.out.println(index + " " + name);
        }

    }
}
