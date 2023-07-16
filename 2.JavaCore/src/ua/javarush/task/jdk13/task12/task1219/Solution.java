package ua.javarush.task.jdk13.task12.task1219;

/* 
Створюємо людину
Є public інтерфейси CanFly (літати), CanRun (бігти/їздити), CanSwim (плавати).
Додай ці інтерфейси класам Human (людина), Duck (качка), Penguin (пінгвин), Airplane (літак), і не забудь про реалізацію
методів інтерфейсів (у методах нічого робити не потрібно).

Requirements:
1. Клас Solution має містити інтерфейс CanFly з одним методом fly().
2. Клас Solution має містити інтерфейс CanRun з одним методом run().
3. Клас Solution має містити інтерфейс CanSwim з одним методом swim().
4. Людина повинна вміти бігати і плавати.
5. Качка повинна вміти літати, плавати і бігати.
6. Пінгвін повинен вміти плавати і бігати.
7. Літак повинен вміти літати.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements CanFly{

        @Override
        public void fly() {

        }
    }
}
