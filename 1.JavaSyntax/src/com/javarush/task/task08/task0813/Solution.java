package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
1. Не изменяй заголовок метода createSet().
2. Программа не должна выводить текст на экран.
3. Программа не должна считывать значения с клавиатуры.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Луна");
        hashSet.add("Луноход");
        hashSet.add("Лук");
        hashSet.add("Лужа");
        hashSet.add("Лезвие");
        hashSet.add("Лирика");
        hashSet.add("Лимон");
        hashSet.add("Латунь");
        hashSet.add("Лужёный");
        hashSet.add("Лень");
        hashSet.add("Ленивый");
        hashSet.add("Линь");
        hashSet.add("Лимур");
        hashSet.add("Любовь");
        hashSet.add("Левый");
        hashSet.add("Ловкий");
        hashSet.add("Лучший");
        hashSet.add("Лишний");
        hashSet.add("Левша");
        hashSet.add("Литература");
        return hashSet;
    }

    public static void main(String[] args) {

    }
}
