package ua.javarush.task.jdk13.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Коти
Давай напишемо програму, яка даватиме імена всім котикам, яких випускає наша котофабрика.

Для цього потрібно:
Зчитувати рядки (параметри) з консолі, допоки користувач не введе порожній рядок (Enter).
Для кожного параметра (імені кота):
створити об'єкт cat класу Cat, який дорівнює коту з getCatByKey(String параметр).
вивести на екран cat.toString().

Requirements:
1. Програма повинна зчитувати дані з клавіатури.
2. Програма має припиняти зчитування даних після введення порожнього рядка.
3. Програма повинна виводити на екран опис кожного кота (cat.toString).
4. Програма повинна створювати об'єкт класу Cat для кожного введеного імені кота (рядка, який зчитується з клавіатури) за допомогою методу getCatByKey.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String read = scanner.nextLine();

            if (read.equals("")) {
                break;
            }

            Cat cat = CatFactory.getCatByKey(read);
            System.out.println(cat.toString());
        }

        // Realisation Second:
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String key;
//
//        while (!(key = reader.readLine()).equals("")) {
//            Cat cat = CatFactory.getCatByKey(key);
//            System.out.println(cat.toString());
//        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василь");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кицюнька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я вуличний кіт " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солідний кошак на ім'я " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - мила кішечка на ім'я " + getName();
        }
    }
}
