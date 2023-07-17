package ua.javarush.task.jdk13.task13.task1304;

/* 
Гей, ти там живий?
У цьому завданні тобі потрібно:

Створити інтерфейс Person.
Додати до нього метод isAlive(), який перевіряє, жива людина чи ні.
Подумати, який тип має повертати цей метод.
Створити інтерфейс Presentable.
Успадкувати інтерфейс Presentable від інтерфейсу Person.

Requirements:
1. У класі Solution має бути оголошено інтерфейс Person.
2. У класі Solution має бути оголошено інтерфейс Presentable.
3. Інтерфейс Presentable має успадкуватися від інтерфейса Person.
4. В інтерфейсі Person має бути оголошено метод isAlive.
5. Тип значення, що повертається, методу isAlive може мати лише два значення.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
    }

    interface Person {
       boolean isAlive();
    }

    interface Presentable extends Person{

    }
}