package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg(); zerg1.name = "Cherv";
        Zerg zerg2 = new Zerg(); zerg2.name = "Ghost";
        Zerg zerg3 = new Zerg(); zerg3.name = "Grid";
        Zerg zerg4 = new Zerg(); zerg4.name = "Stalone";
        Zerg zerg5 = new Zerg(); zerg5.name = "Vinni";

        Protoss protoss1 = new Protoss(); protoss1.name = "Villi";
        Protoss protoss2 = new Protoss(); protoss2.name = "Billi";
        Protoss protoss3 = new Protoss(); protoss3.name = "Dilli";

        Terran terran1 = new Terran(); terran1.name = "Terranus";
        Terran terran2 = new Terran(); terran2.name = "MadMax";
        Terran terran3 = new Terran(); terran3.name = "Vargas";
        Terran terran4 = new Terran(); terran4.name = "Chif";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
