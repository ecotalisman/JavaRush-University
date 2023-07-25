package ua.javarush.task.jdk13.task14.task1405;

/* 
Час поїсти
Давай напишемо програму, яка допоможе тобі обрати, що з'їсти на обід.

Для цього потрібно:
Реалізувати інтерфейс Selectable у класі Food.
Метод onSelect() має виводити на екран фразу "The food was selected".
Подумай, які методи можна викликати для змінної food, а які для — selectable.
У методі callFoodMethods викличи методи onSelect, onEat, якщо це можливо.
У методі callSelectableMethods викличи методи onSelect, onEat, якщо це можливо.
Не використовуй явне приведення типів.

Requirements:
1. Інтерфейс Selectable має бути реалізованим у класі Food.
2. Метод onSelect() у класі Food має виводити на екран фразу "The food was selected".
3. У методі callFoodMethods повинні викликатися методи об'єкту типу Food.
4. У методі callSelectableMethods мають викликатися методи, доступні в будь-якого об'єкта, що реалізує інтерфейс Selectable.
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        // тут додайте виклик методів для змінної food
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        // тут додайте виклик методів для змінної selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        // Add code here:
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
