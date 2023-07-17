package ua.javarush.task.jdk13.task13.task1303;

/* 
Чотири помилки
Виправ 4 помилки в програмі, щоб вона компілювалася.

Requirements:
1. У змінних, оголошених в інтерфейсі, може бути лише найширший рівень доступу (public).
2. Успадкуватися (extends) можна лише від класу: для реалізації інтерфейсів використовується ключове слово implements.
3. Клас Hobby має бути оголошено з модифікатором доступу static.
4. Для доступу до змінної HOBBY не потрібно створювати об'єкт Dream.
5. Оголошення інтерфейсов не змінюй.
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
