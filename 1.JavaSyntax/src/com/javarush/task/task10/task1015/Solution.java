package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] aList = new ArrayList[3];
        aList[0] = new ArrayList(3);
        aList[1] = new ArrayList(5);
        aList[2] = new ArrayList(3);
        aList[0].add("Vasia");
        aList[0].add("Petia");
        aList[0].add("Kolia");
        aList[1].add("1");
        aList[1].add("2");
        aList[1].add("3");
        aList[1].add("4");
        aList[1].add("5");
        aList[2].add("File1");
        aList[2].add("File2");
        aList[2].add("File3");
        //System.out.println( Arrays.toString(aList) );
        return aList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}