package ua.javarush.task.jdk13.task12.task1218;

/* 
їсти, літати й рухатися
Є public інтерфейси CanFly (літати), CanMove (пересуватися), CanEat (їсти).
Додай ці інтерфейси до класів Dog (собака), Car (автомобіль), Duck (качка), Airplane (літак).

Requirements:
1. Клас Solution має містити інтерфейс CanFly з одним методом fly().
2. Клас Solution має містити інтерфейс CanMove з одним методом move().
3. Клас Solution має містити інтерфейс CanEat з одним методом eat().
4. Собака повинна вміти пересуватися і їсти.
5. Автомобіль повинен вміти пересуватися.
6. Літак повинен вміти пересуватися і літати.
7. Качка повинна вміти пересуватися, літати та їсти.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanFly, CanEat, CanMove{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car  implements CanMove{

        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
