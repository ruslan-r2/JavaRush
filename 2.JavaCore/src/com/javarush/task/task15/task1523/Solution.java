package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    private Double dValue;

    Solution() {
    }

    public Solution(int value) {
        super();
    }

    protected Solution(String value) {
        super();
    }

    private Solution(Double value) {
        this.dValue = value;
    }

    public static void main(String[] args) {

    }
}

