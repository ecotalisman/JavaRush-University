package ua.javarush.task.jdk13.task13.task1305;

/* 
Усе, що рухається
У цьому завданні тобі потрібно:

Створити інтерфейс CanMove з методом speed.
Зробити так, щоб speed повертав значення типу Double і нічого не приймав за аргументи.
Створити та успадкувати інтерфейс CanFly від інтерфейсу CanMove.
Додати до інтерфейсу CanFly метод speed.
Переконатися, що speed повертає значення типу Double та приймає один параметр типу CanFly.

Requirements:
1. . У класі Solution має бути оголошено інтерфейс CanMove.
2. . У класі Solution має бути оголошено інтерфейс CanFly.
3. . Інтерфейс CanFly має успадковуватися від інтерфейсу CanMove.
4. . В інтерфейсі CanMove має бути оголошено метод speed без параметрів і з Double - типом значення, що повертається.
5. . В інтерфейсі CanFly має бути оголошено метод speed з одним аргументом типу CanFly і з Double - типом значення, що повертається.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {

        Double speed(CanFly fly);
    }
}