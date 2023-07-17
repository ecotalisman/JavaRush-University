package ua.javarush.task.jdk13.task13.task1307;

/* 
Том, Джеррі та Спайк
Створи класи Dog, Cat і Mouse.

Реалізуй інтерфейси в доданих класах, враховуючи що:
Кіт (Cat) може пересуватися, може когось з'їсти, і його також можуть з'їсти.
Миша (Mouse) може пересуватися, і її можуть з'їсти;
Собака (Dog) може пересуватися і з'їсти когось.

Requirements:
1. Клас Cat потрібно оголосити всередині класу Solution.
2. Клас Dog потрібно оголосити всередині класу Solution.
3. Клас Mouse потрібно оголосити всередині класу Solution.
4. Кіт (Cat) може пересуватися, може когось з'їсти, і його також можуть з'їсти.
5. Миша (Mouse) може пересуватися і її можуть з'їсти.
6. Собака (Dog) може пересуватися і з'їсти когось.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Cat implements Movable, Edible, Eat {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Dog implements Movable, Eat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Edible {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    // може рухатися
    public interface Movable {
        void move();
    }

    // може бути з'їдений
    public interface Edible {
        void beEaten();
    }

    // може когось з'їсти
    public interface Eat {
        void eat();
    }
}