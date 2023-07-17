package ua.javarush.task.jdk13.task13.task1311;

/* 
Інтерфейс Updatable у класі Screen
Реалізуй інтерфейс Updatable у класі Screen.

Requirements:
1. Інтерфейс Updatable має успадковувати (extends) інтерфейс Selectable.
2. Клас Screen має реалізувати (implements) інтерфейс Updatable.
3. У класі Screen потрібно реалізувати метод onSelect інтерфейсу Selectable.
4. У класі Screen потрібно реалізувати метод refresh інтерфейсу Updatable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {

        @Override
        public void onSelect() {

        }
        @Override
        public void refresh() {

        }

    }
}
