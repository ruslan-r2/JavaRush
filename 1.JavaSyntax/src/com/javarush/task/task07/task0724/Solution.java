package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human dedushka1 = new Human("Piter", true, 66);
        Human dedushka2 = new Human("Dmitry", true, 64);
        Human babushka1 = new Human("Anna", false, 65);
        Human babushka2 = new Human("Rita", false, 63);
        Human father = new Human("Alex", true, 40, dedushka1, babushka1);
        Human mother = new Human("Kate", false, 38, dedushka2, babushka2);
        Human son1 = new Human("Jhosh", true, 18, father, mother);
        Human son2 = new Human("Piter", true, 16, father, mother);
        Human doter = new Human("Angela", false, 12, father, mother);

        System.out.println(dedushka1.toString());
        System.out.println(babushka1.toString());
        System.out.println(dedushka2.toString());
        System.out.println(babushka2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(doter.toString());

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int  age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int  age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}