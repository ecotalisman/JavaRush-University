package ua.javarush.task.jdk13.task12.task1220;

/* 
Клас Human та інтерфейси CanRun, CanSwim
Напиши public клас Human (людина) і public інтерфейси CanRun (бігти/їздити), CanSwim(плавати).
Додай до кожного інтерфейсу по oдному методу.
Додай ці інтерфейси до класу Human, але не реалізуй методи.
Оголоси клас Human абстрактним.

Requirements:
1. Клас Solution має містити інтерфейс CanRun з одним методом.
2. Клас Solution має містити інтерфейс CanSwim з одним методом.
3. Клас Solution має містити клас Human.
4. Класс Human має реалізувати інтерфейси CanRun та CanSwim.
5. Клас Human має бути абстрактним.
6. У класа Human не повинно бути методів.
*/

public class Solution {
    public static void main(String[] args) {

    }

    // add public interfaces and a public class here - додай public інтерфейси і public клас тут
    public abstract class Human implements CanRun, CanSwim{

    }

    interface CanRun {
        void run();
    }

    interface CanSwim {
        void swim();
    }
}
