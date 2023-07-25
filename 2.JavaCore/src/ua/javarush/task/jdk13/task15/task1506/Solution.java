package ua.javarush.task.jdk13.task15.task1506;

/* 
Максимально простий код-2
Спрости код — видали всі конструктори та виклики конструкторів суперкласів, які автоматично додаються при компіляції.

Взаємозв'язок між об'єктами класів NakedCat та NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a

Requirements:
1. Клас NormalCat повинен бути нащадком класу NakedCat.
2. Клас SiamCat повинен бути нащадком класу NormalCat.
3. Спрости код класу NakedCat.
4. Спрости код класу NormalCat.
*/

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
        // Comments that code:
//        public NakedCat() {
//            super();
//        }
    }

    public static class NormalCat extends NakedCat {
        // It was a condition:
//        public NormalCat() {
//            super();
//        }

        // Add empty constructor:
        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

/*

Тут представлено Is-a відношення між класами. Is-a є відношенням між класами, коли один клас є підкласом іншого класу.
В даному випадку, SiamCat є NormalCat, який в свою чергу є NakedCat. Це і є відношенням Is-a.

Інакше кажучи, об'єкт класу SiamCat можна розглядати як об'єкт класу NormalCat або NakedCat, тобто ми можемо
використовувати об'єкт SiamCat всюди, де потрібен об'єкт NormalCat або NakedCat. Це відношення є фундаментальним
принципом поліморфізму в об'єктно-орієнтованому програмуванні.

При цьому, об'єкти класу NakedCat не можуть бути розглянуті як об'єкти класу NormalCat або SiamCat, так як вони менш
специфічні. Це відношення встановлює ієрархію між класами, де більш специфічні класи є підкласами менш специфічних класів.

*/