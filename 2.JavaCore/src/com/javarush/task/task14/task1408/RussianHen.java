package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    int getCountOfEggsPerMonth(){
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
