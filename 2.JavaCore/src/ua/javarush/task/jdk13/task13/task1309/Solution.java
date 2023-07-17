package ua.javarush.task.jdk13.task13.task1309;

/*
Neo
У цій задачі тобі потрібно:

Реалізувати інтерфейс DBObject у класі User.
Реалізувати метод initializeIdAndName так, щоб програма працювала і виводила на екран: "The user's name is Neo, id = 1".
Метод toString та метод main змінювати не можна.
Подумай, що має повертати метод initializeIdAndName у класі User.
Зверни увагу: методи toString() і main() змінювати не можна.

Requirements:
1. Інтерфейс DBObject потрібно реалізувати в класі User.
2. Метод initializeIdAndName має повертати коректний об'єкт типи User, об'єкт, на якому відбувається виклик методу("цей" об'єкт).
3. Метод initializeIdAndName має встановлювати значення полів id та name згідно з параметрами, які йому передалися.
4. Програма має виводити на екран: "The user's name is Neo, id = 1".
5. Метод toString не змінюй.
6. Метод main не змінюй.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }
}

/*

1-ий варіант:
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

2-ий варіант:
        @Override
        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

Обидва рішення є вірними і виконують свою роботу, але вони використовують трохи різні підходи до вирішення завдання.

Перший варіант реалізує метод initializeIdAndName в класі User так, що його тип повернення вказано як User,
а не як DBObject. Це є відхиленням від оригінальної сигнатури методу в інтерфейсі DBObject. Завдяки поліморфізму в Java,
цей метод все одно вважається реалізацією інтерфейсного методу, але він дозволяє повертати об'єкти специфічного типу
User замість загального типу DBObject.

Другий варіант дотримується сигнатури методу з інтерфейсу DBObject і реалізує initializeIdAndName з типом повернення
DBObject. Це дотримується більш строгого підходу до реалізації інтерфейсу, де тип повернення методу відповідає тому,
що було вказано в інтерфейсі.

Обидва підходи виконують завдання, але другий варіант може бути кращим з точки зору дотримання контракту інтерфейсу.
Однак перший варіант може бути корисним, якщо вам потрібно використовувати специфічні для User методи або поля після
виклику initializeIdAndName, без необхідності в приведенні типів.

*/