package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human();
        Human grandfather2 = new Human();
        Human grandmather1 = new Human();
        Human grandmather2 = new Human();
        Human father = new Human();
        Human mather = new Human();
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        //grandfather1.toString();
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = null;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
