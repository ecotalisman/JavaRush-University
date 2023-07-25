package ua.javarush.task.jdk13.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
Подивися, що робить ця програма.
Потім зміни haveFun таким чином, щоб він викликав метод:
play(), якщо person має тип Player.
dance(), якщо person має тип Dancer.

Requirements:
1. Клас Player має реалізувати інтерфейс Person.
2. Клас Dancer має реалізувати інтерфейс Person.
3. Метод haveFun() має викликати метод play() у об'єкта, що йому передається, якщо об'єкт є гравцем (Player).
4. Метод haveFun() повинен викликати метод dance() у об'єкта, що йому передається, якщо об'єкт є танцюристом (Dancer).
5. Метод main() має зчитувати дані з клавіатури.
6. Метод main() має припиняти зчитувату дані з клавіатури, якщо введений рядок дорівнює "exit".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //напишіть тут ваш код
        if (person instanceof Player) {
            ((Player) person).play();
        } else {
            ((Dancer) person).dance();
        }
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
