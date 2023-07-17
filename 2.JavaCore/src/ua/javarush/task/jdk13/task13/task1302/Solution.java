package ua.javarush.task.jdk13.task13.task1302;

/* 
Selectable та Updatable
Створи клас Screen та реалізуй у ньому інтерфейси Selectable та Updatable. Не забудь реалізувати методи!

Requirements:
1. Клас Screen має реалізувати (implements) інтерфейс Selectable.
2. Клас Screen має реалізувати (implements) інтерфейс Updatable.
3. У класі Screen мають бути реалізовані методи інтерфейсу Selectable.
4. У класі Screen мають бути реалізовані методи інтерфейсу Updatable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишіть тут ваш код
    public class Screen implements Selectable, Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
